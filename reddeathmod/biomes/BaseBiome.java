package de.toocrazy007.reddeathmod.biomes;

import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeManager.BiomeType;

public abstract class BaseBiome extends Biome{

	public BaseBiome(BiomeProperties properties, String name) {
		super(properties);
		setRegistryName(name);
		
	}
	public BaseBiome(String name) {
		this(new BiomeProperties(name), name);
	}
	public BiomeType getBiomeType() {
		return BiomeType.WARM;
	}

}
