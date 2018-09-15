package de.toocrazy007.reddeathmod.WorldGen;

import java.util.Random;

import de.toocrazy007.reddeathmod.Deathblocks;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenMinable;

public class GenerationUtil {
	
	public static void generateore(IBlockState state,Random random, int x ,int z ,World world ,int chance,int minY,int maxY,int minviensize,int maxviensize ) {
		generateore(state, Deathblocks.deathstone, random, x, z, world, chance, minY, maxY, minviensize, maxviensize);
	}
	
	public static void generateore(IBlockState state,Block blockin,Random random, int x ,int z ,World world ,int chance,int minY,int maxY,int minviensize,int maxviensize ) {
		
		int viensize = minviensize + random.nextInt(maxviensize - minviensize);
		int highrange = maxY - minY;
		
		for(int i = 0; i < chance; i++) {
			int posx = x + random.nextInt(16);
			int posy = random.nextInt(highrange) + minY;
			int posz = z + random.nextInt(16);
			new WorldGenMinable(state, viensize, BlockMatcher.forBlock(blockin)).generate(world, random, new BlockPos(posx, posy, posz));
		}
	}

}
