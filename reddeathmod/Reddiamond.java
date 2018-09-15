package de.toocrazy007.reddeathmod;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class Reddiamond extends Item{
	
	public Reddiamond() {
		
		
		super();
		
	}
	public EnumActionResult onItemUse(ItemStack stack, EntityPlayer playerIn, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
		//Level 1
		worldIn.setBlockState(new BlockPos (pos.getX()+2, pos.getY()+1, pos.getZ()+4), Deathblocks.deathstone.getDefaultState());
		
		worldIn.setBlockState(new BlockPos (pos.getX()+3, pos.getY()+1, pos.getZ()+3), Deathblocks.deathstone.getDefaultState());
		worldIn.setBlockState(new BlockPos (pos.getX()+3, pos.getY()+1, pos.getZ()+4), Deathblocks.deathstone.getDefaultState());
		worldIn.setBlockState(new BlockPos (pos.getX()+3, pos.getY()+1, pos.getZ()+5), Deathblocks.deathstone.getDefaultState());
		
		worldIn.setBlockState(new BlockPos (pos.getX()+4, pos.getY()+1, pos.getZ()+4), Deathblocks.deathstone.getDefaultState());
		
		
		
		//Level 2
		worldIn.setBlockState(new BlockPos (pos.getX()+1, pos.getY()+2, pos.getZ()+4), Deathblocks.deathstone.getDefaultState());
		
		worldIn.setBlockState(new BlockPos (pos.getX()+2, pos.getY()+2, pos.getZ()+3), Deathblocks.deathstone.getDefaultState());
		worldIn.setBlockState(new BlockPos (pos.getX()+2, pos.getY()+2, pos.getZ()+4), Deathblocks.deathstone.getDefaultState());
		worldIn.setBlockState(new BlockPos (pos.getX()+2, pos.getY()+2, pos.getZ()+5), Deathblocks.deathstone.getDefaultState());
		
		worldIn.setBlockState(new BlockPos (pos.getX()+3, pos.getY()+2, pos.getZ()+2), Deathblocks.deathstone.getDefaultState());
		worldIn.setBlockState(new BlockPos (pos.getX()+3, pos.getY()+2, pos.getZ()+3), Deathblocks.deathstone.getDefaultState());
		worldIn.setBlockState(new BlockPos (pos.getX()+3, pos.getY()+2, pos.getZ()+4), Deathblocks.deathstone.getDefaultState());
		worldIn.setBlockState(new BlockPos (pos.getX()+3, pos.getY()+2, pos.getZ()+5), Deathblocks.deathstone.getDefaultState());
		worldIn.setBlockState(new BlockPos (pos.getX()+3, pos.getY()+2, pos.getZ()+6), Deathblocks.deathstone.getDefaultState());
		
		worldIn.setBlockState(new BlockPos (pos.getX()+4, pos.getY()+2, pos.getZ()+3), Deathblocks.deathstone.getDefaultState());
		worldIn.setBlockState(new BlockPos (pos.getX()+4, pos.getY()+2, pos.getZ()+4), Deathblocks.deathstone.getDefaultState());
		worldIn.setBlockState(new BlockPos (pos.getX()+4, pos.getY()+2, pos.getZ()+5), Deathblocks.deathstone.getDefaultState());
		
		worldIn.setBlockState(new BlockPos (pos.getX()+5, pos.getY()+2, pos.getZ()+4), Deathblocks.deathstone.getDefaultState());
		
		
		//Level 3
		worldIn.setBlockState(new BlockPos (pos.getX()+2, pos.getY()+3, pos.getZ()+4), Deathblocks.deathstone.getDefaultState());
		
		worldIn.setBlockState(new BlockPos (pos.getX()+3, pos.getY()+3, pos.getZ()+3), Deathblocks.deathstone.getDefaultState());
		worldIn.setBlockState(new BlockPos (pos.getX()+3, pos.getY()+3, pos.getZ()+4), Deathblocks.redsteelblock.getDefaultState());
		worldIn.setBlockState(new BlockPos (pos.getX()+3, pos.getY()+3, pos.getZ()+5), Deathblocks.deathstone.getDefaultState());
		
		worldIn.setBlockState(new BlockPos (pos.getX()+4, pos.getY()+3, pos.getZ()+4), Deathblocks.deathstone.getDefaultState());
		
		
		
		//Level 4
        worldIn.setBlockState(new BlockPos (pos.getX()+2, pos.getY()+4, pos.getZ()+4), Deathblocks.deathstone.getDefaultState());
		
		worldIn.setBlockState(new BlockPos (pos.getX()+3, pos.getY()+4, pos.getZ()+3), Deathblocks.deathstone.getDefaultState());
		worldIn.setBlockState(new BlockPos (pos.getX()+3, pos.getY()+4, pos.getZ()+4), Deathblocks.redsteelblock.getDefaultState());
		worldIn.setBlockState(new BlockPos (pos.getX()+3, pos.getY()+4, pos.getZ()+5), Deathblocks.deathstone.getDefaultState());
		
		worldIn.setBlockState(new BlockPos (pos.getX()+4, pos.getY()+4, pos.getZ()+4), Deathblocks.deathstone.getDefaultState());
		
		
		//Level 5
		worldIn.setBlockState(new BlockPos (pos.getX()+3, pos.getY()+5, pos.getZ()+4), Deathblocks.deathstone.getDefaultState());
		return EnumActionResult.SUCCESS;
		
	}

}
