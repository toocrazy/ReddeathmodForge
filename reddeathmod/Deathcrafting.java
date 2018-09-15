package de.toocrazy007.reddeathmod;



import java.util.Iterator;

import net.minecraft.client.Minecraft;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class Deathcrafting {
	
	public Deathcrafting() {
		
	}
	
	public void register() {
		GameRegistry.addShapedRecipe(new ItemStack(Deathitems.Reddiamond), new Object[] {"rrr", "rdr", "rrr", 'r', new ItemStack(Deathitems.Redingot), 'd', new ItemStack(Items.DIAMOND)});
		GameRegistry.addShapedRecipe(new ItemStack(Deathblocks.redsteelblock), new Object[] {"rrr", "rrr", "rrr", 'r', new ItemStack(Deathitems.Redingot)});
		GameRegistry.addShapedRecipe(new ItemStack(Deathitems.Basicelementorb), new Object[] {"sss", "ses", "sss", 's', new ItemStack(Blocks.STONE), 'e', new ItemStack(Items.ENDER_PEARL)});
		GameRegistry.addShapedRecipe(new ItemStack(Deathitems.Fireorb), new Object[] {"mlm", "lbl", "mlm", 'm', new ItemStack(Blocks.MAGMA), 'l', new ItemStack(Items.LAVA_BUCKET), 'b', new ItemStack(Deathitems.Basicelementorb)});
		GameRegistry.addShapedRecipe(new ItemStack(Deathitems.Airorb), new Object[] {"ggg", "gbg", "ggg", 'g', new ItemStack(Blocks.GLASS), 'b', new ItemStack(Deathitems.Basicelementorb)});
		GameRegistry.addShapedRecipe(new ItemStack(Deathitems.Earthorb), new Object[] {"ddd", "dbd", "ddd", 'd', new ItemStack(Blocks.DIRT), 'b', new ItemStack(Deathitems.Basicelementorb)});
		GameRegistry.addShapedRecipe(new ItemStack(Deathitems.Waterorb), new Object[] {"awa", "wbw", "awa", 'w', new ItemStack(Items.WATER_BUCKET), 'b', new ItemStack(Deathitems.Basicelementorb)});
		GameRegistry.addShapedRecipe(new ItemStack(Deathitems.Redingot), new Object[] {"nnn", "nxn", "nnn", 'n', new ItemStack(Deathitems.Rednugget)});
		GameRegistry.addShapedRecipe(new ItemStack(Items.IRON_INGOT), new Object[] {"iii", "iii", "iii", 'i', new ItemStack(Deathitems.Ironnugget)});
		GameRegistry.addShapelessRecipe(new ItemStack(Deathitems.Redingot, 9), Deathblocks.redsteelblock);		
		
	}
	public void unregister() {
		
		Iterator<IRecipe> it = CraftingManager.getInstance().getRecipeList().iterator();
		while (it.hasNext()) {
			IRecipe recipe = it.next();
			ItemStack output = recipe.getRecipeOutput();
			if(output != null && output.getItem() != null) {
				//unregister recipes!
				if(output.isItemEqual(new ItemStack(Blocks.PLANKS))) {
					it.remove();
				}
				if(output.isItemEqual(new ItemStack(Blocks.PLANKS, 1 , 2))) {
					it.remove();
				}
				if(output.isItemEqual(new ItemStack(Blocks.PLANKS, 1 , 3))) {
					it.remove();
				}
				if(output.isItemEqual(new ItemStack(Blocks.PLANKS, 1 , 4))) {
					it.remove();
				}
				if(output.isItemEqual(new ItemStack(Blocks.PLANKS, 1 , 5))) {
					it.remove();
				}
				if(output.isItemEqual(new ItemStack(Blocks.PLANKS, 1 , 1))) {
					it.remove();
				}
			}
			
		}

	}

}
