package de.toocrazy007.reddeathmod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class redsteelblock extends Block {

	public redsteelblock() {
		//Material?
		super(Material.IRON);
		this.blockHardness = 7.0F;
		this.blockResistance = 2000F;
		this.setHarvestLevel("pickaxe", 3);
	}

}
