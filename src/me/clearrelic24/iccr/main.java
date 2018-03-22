package me.clearrelic24.iccr;


import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;




public class main extends JavaPlugin implements Listener {
	
	public void onEnable(){
		System.out.println("ICCR Started");
		PluginManager pm = getServer().getPluginManager();
		pm.registerEvents(new Commandes(this), this);
		saveResource("information"+".txt", isEnabled());
		getFile().getName().equals("information"+".txt");
		
		saveDefaultConfig();
		getConfig().options().copyDefaults(true);
	}
	public void onDisable(){
		System.out.println("CR24 Plugins Arrêter avec succes");
	}

}
