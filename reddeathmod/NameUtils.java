package de.toocrazy007.reddeathmod;

import net.minecraft.block.Block;
import net.minecraft.item.Item;

public class NameUtils {
	
	public static void setNames(Object Obj, String name) {
		if(Obj instanceof Item) {
			((Item)Obj).setRegistryName(name).setUnlocalizedName(name);
			
		} else if(Obj instanceof Block) {
			((Block)Obj).setRegistryName(name).setUnlocalizedName(name);
			
		} else {
			throw new IllegalArgumentException();
		}
	}

}
