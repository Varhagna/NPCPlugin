package com.projectkorra.npc.util;


import net.citizensnpcs.api.ai.speech.SpeechContext;

public class MerchantNPC extends KorraNPC {

    public MerchantNPC(String name) {
	super(name);
	// TODO Auto-generated constructor stub
    }

    @Override
    public void speak(SpeechContext s) {
	// TODO Auto-generated method stub
	this.getNPC().getDefaultSpeechController().speak(s);
    }

    @Override
    public void doTheThing() {
	// TODO Auto-generated method stub
	
    }
    

}
