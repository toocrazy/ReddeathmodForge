package de.toocrazy007.reddeathmod.biomes;



import java.awt.Color;

import de.toocrazy007.reddeathmod.Deathblocks;
import net.minecraft.init.Blocks;

public class Deathbiome extends BaseBiome {

	public Deathbiome() {
		super(new BiomeProperties("Deathbiome").setHeightVariation(0.1f).setWaterColor(Color.BLACK.getRGB()), "Deathbiome");
		topBlock = Deathblocks.deathgrass.getDefaultState();
		fillerBlock = Deathblocks.deathstone.getDefaultState();
		
		spawnableMonsterList.clear();
		
		theBiomeDecorator.generateLakes = false;
		theBiomeDecorator.diamondGen = null; 
	}

}
