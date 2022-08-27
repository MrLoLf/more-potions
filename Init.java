package net.mrlolf.morepotions;

import net.fabricmc.api.ModInitializer;

public class Init implements ModInitializer {
	
	public static final String MODID = "morepotions";

	@Override
	public void onInitialize() {
		MorePotions.init();
	}

}
