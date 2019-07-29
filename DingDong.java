package me.MutatedOrange.FirstPlugin.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class DingDong implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (label.equalsIgnoreCase("dingdong")) {
		if (sender instanceof Player) {
			Player player = (Player) sender;
		 	player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&4Ding&6Dong!"));
		 	
		}
		
		else {
			sender.sendMessage("HEY! A player needs to use this you bafoon!");
		}
		}
		return true ;
	}

}
