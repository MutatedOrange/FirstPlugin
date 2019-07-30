package me.MutatedOrange.FirstPlugin.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

import me.MutatedOrange.FirstPlugin.Utils;

public class PunchCounter implements Listener, CommandExecutor {
	private int blocksPunched;

	String igprefix = "§1[§bFirstPlugin§1]§7: §e";
	//listens for if player is interacting
	@EventHandler
	public void onInteract(PlayerInteractEvent event) {

		Action action = event.getAction();

		//tests if player is left clicking a block
		if(action.equals(Action.LEFT_CLICK_BLOCK)) {
			
			Player player = event.getPlayer();
			
			addPunches(1);
			
			player.sendMessage(Utils.chat("debug: " + blocksPunched));
			
			
		}	
	}
	
    public void addPunches(int numToAdd) {        
        this.blocksPunched = this.blocksPunched + numToAdd;
    }
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {	
		
		if(sender instanceof Player) {
		if(label.equalsIgnoreCase("punches")) {
			
			Player player = (Player) sender;
			player.sendMessage(Utils.chat(igprefix + "You have punched a block &8" + String.valueOf(blocksPunched) + "&e Times!"));
						
		}
		}
		return true;
	}
	
}
