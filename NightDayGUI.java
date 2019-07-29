package me.MutatedOrange.FirstPlugin.commands;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import me.MutatedOrange.FirstPlugin.Utils;

public class NightDayGUI {
	String igprefix = "§1[§bFirstPlugin§1]§7: §e";
	public static Inventory dnInventory = Bukkit.createInventory(null, 27, Utils.chat("&3Day/Night Inventory"));
	
	static {
		dnInventory.setItem(12, new ItemStack(Material.GOLD_BLOCK, 1));
		dnInventory.setItem(16, new ItemStack(Material.COAL_BLOCK, 1));		
	}
		
	
	@EventHandler
	public void onInventoryClick(InventoryClickEvent event) {
		
		Player player = (Player) event.getWhoClicked();
		ItemStack clicked = event.getCurrentItem();
		Inventory inventory = event.getInventory();
		if (inventory.getName().equals(dnInventory.getName())) {
			
			if(clicked.getType() == Material.GOLD_BLOCK) {
				
				event.setCancelled(true);
				player.closeInventory();
				World world = Bukkit.getServer().getWorlds().get(0);
			    world.setTime(1000);
			    player.sendMessage(Utils.chat(igprefix + "Time set to &6Day!"));
			}
			else if(clicked.getType() == Material.COAL_BLOCK) {
				
				event.setCancelled(true);
				player.closeInventory();
				World world = Bukkit.getServer().getWorlds().get(0);
			    world.setTime(13000);
			    player.sendMessage(Utils.chat(igprefix + "Time set to &1Night!"));				
			}
			
		}
		
	}
	
}
