package de.toocrazy007.reddeathmod;

import java.lang.ref.Reference;

import de.toocrazy007.reddeathmod.tileentity.TileEntityDeathCrafter;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CommonProxy {
	
	public void registerTileEntities() {
		GameRegistry.registerTileEntity(TileEntityDeathCrafter.class, Reddeathmod.MODID + ":death_crafter");
	}
	
	public void registerModels() { 
		
	}

	public void init() {
		
		
	}

	
}
