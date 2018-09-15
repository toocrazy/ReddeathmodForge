package de.toocrazy007.reddeathmod.struckture;

import java.util.Random;

import de.toocrazy007.reddeathmod.Deathblocks;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class House extends WorldGenerator {

	@Override
	public boolean generate(World worldIn, Random rand, BlockPos position) {
		int X = position.getX();
		int Y = position.getY();
		int Z = position.getZ();
		
		        //Level 1
				worldIn.setBlockState(new BlockPos (X+2, Y+1, Z+4), Deathblocks.deathstone.getDefaultState());
				
				worldIn.setBlockState(new BlockPos (X+3, Y+1, Z+3), Deathblocks.deathstone.getDefaultState());
				worldIn.setBlockState(new BlockPos (X+3, Y+1, Z+4), Deathblocks.deathstone.getDefaultState());
				worldIn.setBlockState(new BlockPos (X+3, Y+1, Z+5), Deathblocks.deathstone.getDefaultState());
				
				worldIn.setBlockState(new BlockPos (X+4, Y+1, Z+4), Deathblocks.deathstone.getDefaultState());
				
				
				
				//Level 2
				worldIn.setBlockState(new BlockPos (X+1, Y+2, Z+4), Deathblocks.deathstone.getDefaultState());
				
				worldIn.setBlockState(new BlockPos (X+2, Y+2, Z+3), Deathblocks.deathstone.getDefaultState());
				worldIn.setBlockState(new BlockPos (X+2, Y+2, Z+4), Deathblocks.deathstone.getDefaultState());
				worldIn.setBlockState(new BlockPos (X+2, Y+2, Z+5), Deathblocks.deathstone.getDefaultState());
				
				worldIn.setBlockState(new BlockPos (X+3, Y+2, Z+2), Deathblocks.deathstone.getDefaultState());
				worldIn.setBlockState(new BlockPos (X+3, Y+2, Z+3), Deathblocks.deathstone.getDefaultState());
				worldIn.setBlockState(new BlockPos (X+3, Y+2, Z+4), Deathblocks.deathstone.getDefaultState());
				worldIn.setBlockState(new BlockPos (X+3, Y+2, Z+5), Deathblocks.deathstone.getDefaultState());
				worldIn.setBlockState(new BlockPos (X+3, Y+2, Z+6), Deathblocks.deathstone.getDefaultState());
				
				worldIn.setBlockState(new BlockPos (X+4, Y+2, Z+3), Deathblocks.deathstone.getDefaultState());
				worldIn.setBlockState(new BlockPos (X+4, Y+2, Z+4), Deathblocks.deathstone.getDefaultState());
				worldIn.setBlockState(new BlockPos (X+4, Y+2, Z+5), Deathblocks.deathstone.getDefaultState());
				
				worldIn.setBlockState(new BlockPos (X+5, Y+2, Z+4), Deathblocks.deathstone.getDefaultState());
				
				
				//Level 3
				worldIn.setBlockState(new BlockPos (X+2, Y+3, Z+4), Deathblocks.deathstone.getDefaultState());
				
				worldIn.setBlockState(new BlockPos (X+3, Y+3, Z+3), Deathblocks.deathstone.getDefaultState());
				worldIn.setBlockState(new BlockPos (X+3, Y+3, Z+4), Deathblocks.redsteelblock.getDefaultState());
				worldIn.setBlockState(new BlockPos (X+3, Y+3, Z+5), Deathblocks.deathstone.getDefaultState());
				
				worldIn.setBlockState(new BlockPos (X+4, Y+3, Z+4), Deathblocks.deathstone.getDefaultState());
				
				
				
				//Level 4
		        worldIn.setBlockState(new BlockPos (X+2, Y+4, Z+4), Deathblocks.deathstone.getDefaultState());
				
				worldIn.setBlockState(new BlockPos (X+3, Y+4, Z+3), Deathblocks.deathstone.getDefaultState());
				worldIn.setBlockState(new BlockPos (X+3, Y+4, Z+4), Deathblocks.redsteelblock.getDefaultState());
				worldIn.setBlockState(new BlockPos (X+3, Y+4, Z+5), Deathblocks.deathstone.getDefaultState());
				
				worldIn.setBlockState(new BlockPos (X+4, Y+4, Z+4), Deathblocks.deathstone.getDefaultState());
				
				
				//Level 5
				worldIn.setBlockState(new BlockPos (X+3, Y+5, Z+4), Deathblocks.deathstone.getDefaultState());
		
		return false;
	}

}
