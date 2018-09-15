package de.toocrazy007.reddeathmod;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class Deathitems {
	
	public static Item Redingot;
	public static Item Rednugget;
	public static Item Reddiamond;
	public static Item Ironnugget;
	public static Item Basicelementorb;
	public static Item Waterorb;
	public static Item Airorb;
	public static Item Earthorb;
	public static Item Fireorb;
	
	public void init() {
		Redingot = new Redingot().setCreativeTab(Reddeathmod.instance.tab);
		NameUtils.setNames(Redingot, "Redingot");
		Rednugget = new Rednugget().setCreativeTab(Reddeathmod.instance.tab);
		NameUtils.setNames(Rednugget, "Rednugget");
		Reddiamond = new Reddiamond().setCreativeTab(Reddeathmod.instance.tab);
		NameUtils.setNames(Reddiamond, "Reddiamond");
		Ironnugget = new Ironnugget().setCreativeTab(Reddeathmod.instance.tab);
		NameUtils.setNames(Ironnugget, "Ironnugget");
		Basicelementorb = new Basicelementorb().setCreativeTab(Reddeathmod.instance.tab);
		NameUtils.setNames(Basicelementorb, "Basicelementorb");
		Waterorb = new Waterorb().setCreativeTab(Reddeathmod.instance.tab);
		NameUtils.setNames(Waterorb, "Waterorb");
		Airorb = new Airorb().setCreativeTab(Reddeathmod.instance.tab);
		NameUtils.setNames(Airorb, "Airorb");
		Earthorb = new Earthorb().setCreativeTab(Reddeathmod.instance.tab);
		NameUtils.setNames(Earthorb, "Earthorb");
		Fireorb = new Fireorb().setCreativeTab(Reddeathmod.instance.tab);
		NameUtils.setNames(Fireorb, "Fireorb");

		
	}
	
	public void register() {
		registerItem(Redingot);
		registerItem(Rednugget);
		registerItem(Reddiamond);
		registerItem(Ironnugget);
		registerItem(Basicelementorb);
		registerItem(Waterorb);
		registerItem(Airorb);
		registerItem(Earthorb);
		registerItem(Fireorb);
		
	}
	
	private void registerItem(Item item) {
		GameRegistry.register(item);
	}

}
