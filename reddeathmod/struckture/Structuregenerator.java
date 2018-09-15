package de.toocrazy007.reddeathmod.struckture;

import java.util.Random;

import de.toocrazy007.reddeathmod.biomes.Deathbiome;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraftforge.fml.common.IWorldGenerator;

public class Structuregenerator implements IWorldGenerator{

	//@formatter:off
	
	House house = new House();
	
	//@formatter:on
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator,IChunkProvider chunkProvider) {
	     switch (world.provider.getDimension()) {
	     case 0: //Overworld
	    	 this.runHouseGenerator(world, random, chunkX, chunkZ);
	    	 break;
	     case -1: //Nether
	    	 
	    	 break;
	     case 1: //End
	    	 
	    	 break;
	    		 
	     }
			
	}
	
	public void runHouseGenerator (World world, Random random, int chunkX, int chunkZ) {
		int x = chunkX * 16 + random.nextInt(16);
		int z = chunkZ * 16 + random.nextInt(16);
		int xy = x >> 4;
	    int zy = z >> 4;
	    int height = world.getChunkFromChunkCoords(xy, zy).getHeight(new BlockPos(x & 15, 0, z & 15));
	    int y = height - 1;
        
	    if(world.getBiomeForCoordsBody(new BlockPos(x,y,z)).getBiomeClass().equals(Deathbiome.class)) {
        	
        
	       if((random.nextInt(300) +1) <= 10) {

	          boolean place = true;
	          //Z
	          for(int j = 0; j < 7; j++) {
	    	      //Y
	    	      for(int k = 0; k < 6; k++) {
	    		      //X
	    		      for(int i = 0; i < 6; i++) {
	    			      if(world.getBlockState(new BlockPos(i + x, j + y + 1, k + z)).getBlock() != Blocks.AIR) {
	    				      place = false;
	    			      }
	    		      }
	    		
	    	      }
	          }
	          if(place) {
	    	      house.generate(world, random, new BlockPos(x,y,z));
	          }
	  
	      }
	
      }
   }
}	