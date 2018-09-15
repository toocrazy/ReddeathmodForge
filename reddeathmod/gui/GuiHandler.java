package de.toocrazy007.reddeathmod.gui;

import java.awt.Container;

import de.toocrazy007.reddeathmod.Deathportalstone;
import de.toocrazy007.reddeathmod.container.ContainerDeathCrafter;
import de.toocrazy007.reddeathmod.tileentity.TileEntityDeathCrafter;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler{
	
	public static final int DEATH_CRAFTER = 0;

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		if(ID == DEATH_CRAFTER) {
			return new ContainerDeathCrafter(player.inventory, (TileEntityDeathCrafter) world.getTileEntity(new BlockPos(x, y, z)));
		}
		
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		if(ID == DEATH_CRAFTER) {
			return new GuiDeathCrafter(player.inventory, (TileEntityDeathCrafter) world.getTileEntity(new BlockPos(x, y, z)));
		}
		return null;
	}

}
