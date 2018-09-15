package de.toocrazy007.reddeathmod.WorldGen;

import java.util.Random;

import de.toocrazy007.reddeathmod.Deathblocks;
import de.toocrazy007.reddeathmod.Reddeathmod;
import de.toocrazy007.reddeathmod.biomes.Deathbiome;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class OreGen implements IWorldGenerator{
	
	private WorldGenerator Redore_overworld;
	
	private void nether(Random random, int x, int z, World world) {
		
	}
    private void end(Random random, int x, int z, World world) {
		
	}
    private void overworld(Random random, int x, int z, World world) {
    	
    	GenerationUtil.generateore(Deathblocks.Redsteelore.getDefaultState(), random, x, z, world, 50, 10, 150, 5, 10);
	
    }	
		
		
		
		
	

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator,
			IChunkProvider chunkProvider) {
		int x = chunkX * 16;
		int z = chunkZ * 16;
		switch(world.provider.getDimension()) {
		case 1:
			nether(random, x, z, world);
			break;
		case 0:
			overworld(random, x, z, world);
			break;
		case -1:
			end(random, x, z, world);
			break;
		
		}
		
		
	}

}
