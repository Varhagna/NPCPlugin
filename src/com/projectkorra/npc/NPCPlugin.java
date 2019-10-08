package com.projectkorra.npc;

import org.bukkit.plugin.java.JavaPlugin;

public class NPCPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
	System.out.println("[NPCPlugin] Enabling Config, NPCs, and Listeners");
	
	this.getServer().getConfiguration().setDefaults(true);
	System.out.println("[NPCPlugin] Config Successfully Enabled");
	    
	System.out.println("[NPCPlugin] NPCs Successfully Enabled");
	
	System.out.println("[NPCPlugin] Listeners Successfully Enabled");
    }
    
    @Override
    public void onDisable() {
	System.out.println("[NPCPlugin] Saving Config, Disabling Listeners and NPCs");
    }

}
