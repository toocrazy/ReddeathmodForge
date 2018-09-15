package de.toocrazy007.reddeathmod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class deathstone extends Block{

	public deathstone() {
		super(Material.IRON);
		this.blockHardness = 5.0F;
		this.blockResistance = 2000F;
		this.setHarvestLevel("pickaxe", 2);
		
	}

}
