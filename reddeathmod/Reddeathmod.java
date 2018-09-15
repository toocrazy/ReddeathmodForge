package de.toocrazy007.reddeathmod;



import java.lang.ref.Reference;
import java.lang.reflect.Proxy;

import de.toocrazy007.reddeathmod.WorldGen.OreGen;
import de.toocrazy007.reddeathmod.biomes.BaseBiome;
import de.toocrazy007.reddeathmod.biomes.Deathbiome;

import de.toocrazy007.reddeathmod.struckture.Structuregenerator;

import net.minecraft.init.Blocks;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.BiomeManager.BiomeEntry;
import net.minecraftforge.common.BiomeManager.BiomeType;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Reddeathmod.MODID, version = Reddeathmod.VERSION, name = Reddeathmod.NAME)
public class Reddeathmod {

    public static final String MODID = "reddeathmod";
    public static final String VERSION = "1.0";
    public static final String NAME = "reddeathmod";
    
    
    
    @Instance(MODID)
    public static Reddeathmod instance = new Reddeathmod();
    
    @SidedProxy(modId = MODID, serverSide = "de.toocrazy007.reddeathmod.CommonProxy", clientSide = "de.toocrazy007.reddeathmod.ClientProxy")
    public static CommonProxy proxy = new CommonProxy();
    
    
    public DeathTab tab;
    public Deathitems items;
    public Deathblocks blocks;
    
    public Deathcrafting crafting;
    public Deathsmelting smelting;
    public static Deathbiome deathbiome;
    
    
    
    
    
    @EventHandler
    public void preintinit(FMLPreInitializationEvent event) {
    	
    	
    	
    	//null?
    	tab = new DeathTab(null);
    	items = new Deathitems();
    	items.init();
    	items.register();
       	blocks = new Deathblocks();
    	blocks.init();
    	blocks.register();
    	
    	proxy.registerTileEntities();

    	
    	
    }
   
    
    
    @EventHandler
    public void init(FMLInitializationEvent event) {
    	proxy.registerModels();
    	crafting = new Deathcrafting();
    	crafting.unregister();
    	crafting.register();
    	smelting = new Deathsmelting();
    	smelting.unregister();
    	smelting.register();
    	deathbiome = new Deathbiome();
    	
    	registerBiome(deathbiome, true);
    	GameRegistry.registerWorldGenerator(new Structuregenerator(), 0);
    	GameRegistry.registerWorldGenerator(new OreGen(), 0);
    	
    	
        
    	
    }
    
    
    @EventHandler
    public void postinit(FMLPostInitializationEvent event)
    {
    	
    }
    
    public static void registerBiome(BaseBiome biome, boolean isspawnbiome) {
    	GameRegistry.register(biome);
    	BiomeManager.addBiome(biome.getBiomeType(), new BiomeEntry(biome, 100));
    	if (isspawnbiome) {
    		BiomeManager.addSpawnBiome(biome);
    	}
    }
}
