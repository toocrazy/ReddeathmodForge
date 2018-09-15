package de.toocrazy007.reddeathmod;


import de.toocrazy007.reddeathmod.gui.GuiHandler;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.network.NetworkRegistry;

public class ClientProxy extends CommonProxy {

	
		
	
	
	public void registerModels() {
		//items//
		registerModel(Deathitems.Reddiamond, 0, new ModelResourceLocation(Deathitems.Reddiamond.getRegistryName(), "inventory"));
		registerModel(Deathitems.Rednugget, 0, new ModelResourceLocation(Deathitems.Rednugget.getRegistryName(), "inventory"));
		registerModel(Deathitems.Redingot, 0, new ModelResourceLocation(Deathitems.Redingot.getRegistryName(), "inventory"));
		registerModel(Deathitems.Ironnugget, 0, new ModelResourceLocation(Deathitems.Ironnugget.getRegistryName(), "inventory"));
		    //element//
		    registerModel(Deathitems.Basicelementorb, 0, new ModelResourceLocation(Deathitems.Basicelementorb.getRegistryName(), "inventory"));
		    registerModel(Deathitems.Airorb, 0, new ModelResourceLocation(Deathitems.Airorb.getRegistryName(), "inventory"));
		    registerModel(Deathitems.Fireorb, 0, new ModelResourceLocation(Deathitems.Fireorb.getRegistryName(), "inventory"));
		    registerModel(Deathitems.Waterorb, 0, new ModelResourceLocation(Deathitems.Waterorb.getRegistryName(), "inventory"));
		    registerModel(Deathitems.Earthorb, 0, new ModelResourceLocation(Deathitems.Earthorb.getRegistryName(), "inventory"));
		//blocks//
		registerModel(Deathblocks.deathgrass, 0, new ModelResourceLocation(Deathblocks.deathgrass.getRegistryName(), "inventory"));
		registerModel(Deathblocks.deathstone, 0, new ModelResourceLocation(Deathblocks.deathstone.getRegistryName(), "inventory"));
		registerModel(Deathblocks.redsteelblock, 0, new ModelResourceLocation(Deathblocks.redsteelblock.getRegistryName(), "inventory"));
		registerModel(Deathblocks.Redsteelore, 0, new ModelResourceLocation(Deathblocks.Redsteelore.getRegistryName(), "inventory"));
		registerModel(Deathblocks.Deathportalstone, 0, new ModelResourceLocation(Deathblocks.Deathportalstone.getRegistryName(), "inventory"));
		
	}
	
	
	private void registerModel(Object obj, int meta, ModelResourceLocation loc) {
		Item item = null;
		if(obj instanceof Item) {
			item = (Item) obj;
			
		} else if(obj instanceof Block) {
			item =Item.getItemFromBlock((Block)obj);
		} else {
			throw new IllegalArgumentException();
		}
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, meta, loc);
	}
	@Override
	public void init() {
		NetworkRegistry.INSTANCE.registerGuiHandler(Reddeathmod.instance, new GuiHandler());

	}

}
