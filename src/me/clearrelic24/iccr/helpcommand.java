package me.clearrelic24.iccr;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class helpcommand implements Listener, CommandExecutor {

	public helpcommand(main main) {
		// TODO Auto-generated constructor stub
	}
	 public helpcommand() {
		// TODO Auto-generated constructor stub
	}
	@EventHandler
		public boolean onCommand(CommandSender sender, Command command, String label, String[] args){

				
			if(sender instanceof Player){
					
				Player player = (Player)sender;
				
				if(command.getName().equalsIgnoreCase("ItemCondenserCR")){
					if(args.length == 0){
						player.sendMessage("§e======================================");
						player.sendMessage("§9            ItemCondenserCR           ");
						player.sendMessage("§e======================================");
						player.sendMessage("§e==   Created by ClearRelic24        ==");
						player.sendMessage("§e======================================");
						player.sendMessage("§eFor help do /ItemCondenserCR help     ");
						player.sendMessage("§e======================================");
						player.sendMessage("§eFor info do /ItemCondenserCR info     ");
						player.sendMessage("§e======================================");
					}
					if(args.length == 1){
						if(args[0].equalsIgnoreCase("help")){
							player.sendMessage("§e======================================");
							player.sendMessage("§9            ItemCondenserCR           ");
							player.sendMessage("§e======================================");
							player.sendMessage("§e==     Created by ClearRelic24      ==");
							player.sendMessage("§e======================================");
							player.sendMessage("§e==         Help Sub-command         ==");
							player.sendMessage("§e======================================");
							player.sendMessage("§e==    §9/ItemCondenserCR help cook    ==");
							player.sendMessage("§e==  §9/ItemCondenserCR help condense  ==");
							player.sendMessage("§e======================================");
							if(args.length == 2){
								if(args[0].equalsIgnoreCase("Cook")){
									player.sendMessage("§e======================================");
									player.sendMessage("§9            ItemCondenserCR           ");
									player.sendMessage("§e======================================");
									player.sendMessage("§e==     Created by ClearRelic24      ==");
									player.sendMessage("§e======================================");
									player.sendMessage("§e==      §8/cook Command help page     ==");
									player.sendMessage("§e======================================");
									player.sendMessage("§e==  This command change Iron or gold  ==");
									player.sendMessage("§e==     ore in iron or gold ingot    ==");
									player.sendMessage("§e======================================");
								}if(args[0].equalsIgnoreCase("Condenser")){
									player.sendMessage("§e======================================");
									player.sendMessage("§9            ItemCondenserCR           ");
									player.sendMessage("§e======================================");
									player.sendMessage("§e==     Created by ClearRelic24      ==");
									player.sendMessage("§e======================================");
									player.sendMessage("§e==   §8/condenser Command help page   ==");
									player.sendMessage("§e======================================");
									player.sendMessage("§e==This command change ingot, nugget ==");
									player.sendMessage("§e==     of iron and gold, diamond    ==");
									player.sendMessage("§e==   emerald, wheat, redstone, coal ==");
									player.sendMessage("§e==   Slime ball and more on Block   ==");
									player.sendMessage("§e======================================");
								}
							}
						}if(args[0].equalsIgnoreCase("Info")){
							player.sendMessage("§e======================================");
							player.sendMessage("§9            ItemCondenserCR           ");
							player.sendMessage("§e======================================");
							player.sendMessage("§e==     Created by ClearRelic24      ==");
							player.sendMessage("§e======================================");
							player.sendMessage("§e==   Information page of plugin     ==");
							player.sendMessage("§e======================================");
							player.sendMessage("§e==  §6§lContact:§r§e clearrelic24@gmail.com ==");
							player.sendMessage("§e==§6Tested by:§eCRServ (crserv.craft.gg)==");
							player.sendMessage("§e== §6Developped by:§e CR24STUDIO Team   ==");
							player.sendMessage("§e==   §6§lVersion:§r§e 1.4.1 Alpha CRServ    ==");
							player.sendMessage("§e======================================");
							
						}if(args[0].equalsIgnoreCase("Contact")){
							player.sendMessage("§e======================================");
							player.sendMessage("§9            ItemCondenserCR           ");
							player.sendMessage("§e======================================");
							player.sendMessage("§e==     Created by ClearRelic24      ==");
							player.sendMessage("§e======================================");
							player.sendMessage("§e==   Contact page of plugin     ==");
							player.sendMessage("§e======================================");
							player.sendMessage("§e==  §6Email:§e clearrelic24@gmail.com   ==");
							player.sendMessage("§e==§6Skype:§e bbc4.                      ==");
							player.sendMessage("§e==§6Twitter:§e @ClearRelic24            ==");
							player.sendMessage("§6Youtube:§e http://www.youtube.com/c/clearrelic24");
							player.sendMessage("§e======================================");
						}if(args[0].equalsIgnoreCase("Version")){
							player.sendMessage("§e======================================");
							player.sendMessage("§9            ItemCondenserCR           ");
							player.sendMessage("§e======================================");
							player.sendMessage("§e==     Created by ClearRelic24      ==");
							player.sendMessage("§e======================================");
							player.sendMessage("§e==   version page of plugin     ==");
							player.sendMessage("§e======================================");
							player.sendMessage("§e==  §6Version :§e 1.4.1 Alpha CRServ    ==");
							player.sendMessage("§e==§6Info:§e SNAPSHOT Version for CRServ ==");
							player.sendMessage("§e==§6Date:§e 26/02/2018                  ==");
							player.sendMessage("§e==§6Author:§e ClearRelic24              ==");
							player.sendMessage("§e======================================");
							
						}
						
					}

}
}
			return false;
}
}