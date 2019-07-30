package me.MutatedOrange.FirstPlugin.commands;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

import me.MutatedOrange.FirstPlugin.Utils;

public class HealingStation implements Listener{
	String igprefix = "§1[§bFirstPlugin§1]§7: §e";
	//listens for if player is interacting
	@EventHandler
	public void onInteract(PlayerInteractEvent event) {
		
		Player player = event.getPlayer();
		Action action = event.getAction();
		Block block = event.getClickedBlock();

		//tests if player is left clicking a block
		if(action.equals(Action.LEFT_CLICK_BLOCK)) {
			//tests if block is an emerald block
			if(block.getType().equals(Material.EMERALD_BLOCK)) {
			//finds how much health to heal	
			double currentHealth = player.getHealth();
			double healthToHeal = 20 - currentHealth;
			if(currentHealth == 20) {
				player.sendMessage(Utils.chat(igprefix + "You are already at full health!"));
				
			}
			else {
			//heals and tells the player how much it healed them
			player.setHealth(20);
			player.sendMessage(Utils.chat(igprefix + "&aYou have been healed for &4&l" + healthToHeal + " &r&ahealth!"));
			}
			
			}
			
		}
	}
	
}
