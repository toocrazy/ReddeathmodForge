package de.toocrazy007.reddeathmod;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class Deathblocks {
	
	public static Block redsteelblock;
	public static Block Redsteelore;
	public static Block deathgrass;
	public static Block deathstone;
    public static Block Deathportalstone;
    public static  int guiIDdeathcrafter;
	
	public void init() {
		redsteelblock = new redsteelblock().setCreativeTab(Reddeathmod.instance.tab);
		NameUtils.setNames(redsteelblock, "redsteelblock");
		Redsteelore = new Redsteelore().setCreativeTab(Reddeathmod.instance.tab);
		NameUtils.setNames(Redsteelore, "Redsteelore");
		deathgrass = new deathgrass().setCreativeTab(Reddeathmod.instance.tab);
		NameUtils.setNames(deathgrass, "deathgrass");
		deathstone = new deathstone().setCreativeTab(Reddeathmod.instance.tab);
		NameUtils.setNames(deathstone, "deathstone");
		Deathportalstone = new Deathportalstone().setCreativeTab(Reddeathmod.instance.tab);
		NameUtils.setNames(Deathportalstone, "Deathportalstone");
		
		
		
	}

	public void register() {
		registerBlock(redsteelblock);
		registerBlock(Redsteelore);
		registerBlock(deathgrass);
		registerBlock(deathstone);
		registerBlock(Deathportalstone);
	}
	private void registerBlock(Block block) {
		GameRegistry.register(block);
		ItemBlock itemblock = new ItemBlock(block);
	    itemblock.setUnlocalizedName(block.getUnlocalizedName()).setRegistryName(block.getRegistryName());
	    GameRegistry.register(itemblock);
	}
	

}
