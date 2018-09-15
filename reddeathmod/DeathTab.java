package de.toocrazy007.reddeathmod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class DeathTab extends CreativeTabs {
	public DeathTab(String label) {
		super("Deathmod");
		this.setBackgroundImageName("item_search.png");

	}

	{
}

	@Override
	public Item getTabIconItem() {
		
		return Item.getItemFromBlock(Deathblocks.redsteelblock);
	}
	
	@Override
	public boolean hasSearchBar() {

		return true;
	}


}
