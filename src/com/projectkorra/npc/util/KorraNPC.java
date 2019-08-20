package com.projectkorra.npc.util;


import org.bukkit.entity.EntityType;

import net.citizensnpcs.api.CitizensAPI;
import net.citizensnpcs.api.ai.speech.SpeechContext;
import net.citizensnpcs.api.npc.NPC;

public abstract class KorraNPC{
    
    private NPC npc;
    
    public KorraNPC(String name) {
	npc = CitizensAPI.getNPCRegistry().createNPC(EntityType.PLAYER, name);
    }
    
    public NPC getNPC() {
	return npc;
    }
    
    public abstract void speak(SpeechContext s);
    
    public abstract void doTheThing();
    
}
