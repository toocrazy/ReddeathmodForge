package de.toocrazy007.reddeathmod.container;

import de.toocrazy007.reddeathmod.Deathportalstone;
import de.toocrazy007.reddeathmod.tileentity.TileEntityDeathCrafter;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.SlotItemHandler;

public class ContainerDeathCrafter extends Container {
	
	private TileEntityDeathCrafter dps;
	
	public ContainerDeathCrafter(IInventory playerInv,TileEntityDeathCrafter dps) {
		this.dps = dps;
		IItemHandler handler = dps.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null);
		
		this.addSlotToContainer(new SlotItemHandler(handler, 0, 62, 17));
		//TODO create texture and switch x and y(Video 2:50)//
		int xPos = 8;
		int yPos = 84;
				
		for (int y = 0; y < 3; ++y) {
			for (int x = 0; x < 9; ++x) {
				this.addSlotToContainer(new Slot(playerInv, x + y * 9 + 9, xPos + x * 18, yPos + y * 18));
			}
		}
				
		for (int x = 0; x < 9; ++x) {
			this.addSlotToContainer(new Slot(playerInv, x, xPos + x * 18, yPos + 58));
		}
	}

	@Override
	public boolean canInteractWith(EntityPlayer playerIn) {
		


		return false;
	}

}
