package me.MutatedOrange.FirstPlugin.commands;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedEnterEvent;


public class EnterBed implements Listener{
	
	@EventHandler
	public void onPlayerBedEnter(PlayerBedEnterEvent event) {
		Player player = event.getPlayer();
		// gets players location in bed
		Location locAbovePlayer = player.getLocation();
		// sets location to 2 blocks above them
		locAbovePlayer.setY(locAbovePlayer.getY() + 2);
		//gets block at new location
		Block b = locAbovePlayer.getBlock();
		//sets the block type to Glowstone
		b.setType(Material.GLOWSTONE);		
		
	}
	
	
}
