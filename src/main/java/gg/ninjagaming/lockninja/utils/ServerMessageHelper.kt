package gg.ninjagaming.lockninja.utils

import gg.ninjagaming.lockninja.utils.Settings.prefixString
import org.bukkit.Bukkit

object ServerMessageHelper {
    fun sendMessage(messageString: String) {
        Bukkit.getConsoleSender().sendMessage("$prefixString$messageString")
    }
}