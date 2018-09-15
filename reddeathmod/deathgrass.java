package de.toocrazy007.reddeathmod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class deathgrass extends Block{

	public deathgrass() {
		super(Material.GRASS);
		this.blockHardness = 5.0F;
		this.blockResistance = 2000F;
		this.setHarvestLevel("shovel", 2);
	}

}
