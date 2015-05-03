package uk.theendlessnet.bedtp;

import org.bukkit.command.Command;

import org.bukkit.command.CommandSender;

import org.bukkit.entity.Player;

import org.bukkit.plugin.java.JavaPlugin;

public class EasySpawn extends JavaPlugin{

	@Override
	public boolean onCommand(CommandSender sender, Command command,
			String label, String[] args) {
		if(sender instanceof Player){
			Player player = (Player)sender;
			if(command.getName().equalsIgnoreCase("bed")){
				if(player.getBedSpawnLocation()!=null){
					player.teleport(player.getBedSpawnLocation());
					player.sendMessage("Teleporting to your bed.");
				}else sender.sendMessage("Your bed is missing or obstructed..");
				return true;
			}
		}
		return false;
	}

}
