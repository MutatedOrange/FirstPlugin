package me.MutatedOrange.FirstPlugin.commands;

import org.bukkit.event.Listener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerJoinEvent;

public class Joinmsg implements Listener{
	@EventHandler	
	public void onPlayerJoin(PlayerJoinEvent event) {
		event.setJoinMessage("§eWelcome, §6" + event.getPlayer().getName() + "!");
			
	}		
}
