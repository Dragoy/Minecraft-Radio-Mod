package net.medsouz.radioblock;

import net.minecraftforge.client.MinecraftForgeClient;

public class ClientProxy extends CommonProxy{
	
	@Override
	public void registerRenderers(){
		//MinecraftForgeClient.preloadTexture(RADIO_PNG);
	}
}
