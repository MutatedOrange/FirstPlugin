package me.MutatedOrange.FirstPlugin.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Showoff implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (label.equalsIgnoreCase("showoff")) {
		if (sender instanceof Player) {
			Player player = (Player) sender;
		 	player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&4R&6A&eI&2N&bB&1O&dW&5!&6!&0!&7!"));
		 	
		}
		
		else {
			sender.sendMessage("HEY! A player needs to use this you bafoon!");
		}
		}
		return true ;
	}

}