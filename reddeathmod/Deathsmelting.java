package de.toocrazy007.reddeathmod;

import java.util.Iterator;
import java.util.Map.Entry;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class Deathsmelting {

	public void unregister() {
		Iterator<Entry<ItemStack, ItemStack>> it = FurnaceRecipes.instance().getSmeltingList().entrySet().iterator();
		while(it.hasNext()) {
			Entry<ItemStack, ItemStack> entry = it.next();
			ItemStack input = entry.getKey();
		    ItemStack output = entry.getValue();
		    if(output != null && output.getItem() != null) {
		    	if(output.getItem() == Items.GOLD_INGOT) {
		    		it.remove();
		    	}
		    	if(output.getItem() == Items.IRON_INGOT) {
		    		it.remove();
		    	}
		    }
		}
	}

	public void register() {
		
		GameRegistry.addSmelting(Deathblocks.Redsteelore, new ItemStack(Deathitems.Rednugget, 2),1.0F);
		GameRegistry.addSmelting(Blocks.GOLD_ORE, new ItemStack(Items.GOLD_NUGGET,3), 1.0F);
		GameRegistry.addSmelting(Blocks.IRON_ORE, new ItemStack(Deathitems.Ironnugget,3), 1.0F);
		//iron Recept adden!//
	}

}
