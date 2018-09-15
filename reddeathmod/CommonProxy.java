package de.toocrazy007.reddeathmod;

import java.lang.ref.Reference;

import de.toocrazy007.reddeathmod.gui.GuiHandler;
import de.toocrazy007.reddeathmod.tileentity.TileEntityDeathCrafter;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CommonProxy {
	
	public void registerTileEntities() {
		GameRegistry.registerTileEntity(TileEntityDeathCrafter.class, Reddeathmod.MODID + ":death_crafter");
	}
	
	public void registerModels() { 
		
	}

	public void init() {
		NetworkRegistry.INSTANCE.registerGuiHandler(Reddeathmod.instance, new GuiHandler());
		
	}

	
}
