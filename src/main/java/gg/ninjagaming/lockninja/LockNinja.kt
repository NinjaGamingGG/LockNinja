package gg.ninjagaming.lockninja

import gg.ninjagaming.lockninja.utils.ServerMessageHelper
import org.bukkit.Bukkit
import org.bukkit.GameRule
import org.bukkit.plugin.java.JavaPlugin

@Suppress("unused")//It's a plugins so obviously it is going to be unused
class LockNinja : JavaPlugin() {
    override fun onEnable() {
        // Plugin startup logic
        ServerMessageHelper.sendMessage("Plugin Enabled!")
        val worldsList = Bukkit.getWorlds()

        worldsList.forEach(){
            if (it == null)
                return@forEach

            //Lock daytime and set it to 6000 / noon
            it.setGameRule(GameRule.DO_DAYLIGHT_CYCLE,false)
            it.time = 6000
            ServerMessageHelper.sendMessage("Daytime locked for world: ${it.name}")

            //Lock weather and set it to clear
            it.setGameRule(GameRule.DO_WEATHER_CYCLE, false)
            it.clearWeatherDuration = 1
            ServerMessageHelper.sendMessage("Weather locked for world: ${it.name}")
        }

    }
}