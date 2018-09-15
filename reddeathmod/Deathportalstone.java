package de.toocrazy007.reddeathmod;



import de.toocrazy007.reddeathmod.gui.GuiHandler;
import de.toocrazy007.reddeathmod.tileentity.TileEntityDeathCrafter;
import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.InventoryHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandler;
import scala.annotation.meta.param;

public class Deathportalstone extends Block {

	public Deathportalstone() {
		super(Material.ROCK);
		this.blockHardness = 5.0F;
		this.blockResistance = 5000F;
		this.setHarvestLevel("pickaxe", 3);
	}

@Override
public TileEntity createTileEntity(World world, IBlockState state) {
	
	return new TileEntityDeathCrafter();
}
@Override
public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer p,
		EnumHand hand, ItemStack heldItem, EnumFacing side, float hitX, float hitY, float hitZ) {
	if(!p.isSneaking()) {
		if(world.isRemote) {
			p.openGui(Reddeathmod.instance, GuiHandler.DEATH_CRAFTER, world, pos.getX(), pos.getY(), pos.getZ());
		}
		
		return true;
	}else {
		return false;
	//return super.onBlockActivated(world, pos, state, playerIn, hand, heldItem, side, hitX, hitY, hitZ);
}

	
}
public TileEntity createNewTileEntity(World worldIn, int meta) {
	// TODO Auto-generated method stub
	return new TileEntityDeathCrafter();
}
@Override
public void breakBlock(World world, BlockPos pos, IBlockState state) {
	TileEntityDeathCrafter dps = (TileEntityDeathCrafter) world.getTileEntity(pos);
	IItemHandler handler = dps.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null);
	for(int slot = 0; slot < handler.getSlots() - 1; slot++) {
		ItemStack stack = handler.getStackInSlot(slot);
		InventoryHelper.spawnItemStack(world,pos.getX(), pos.getY(), pos.getZ(), stack);
	}
	super.breakBlock(world, pos, state);
}
	

}
