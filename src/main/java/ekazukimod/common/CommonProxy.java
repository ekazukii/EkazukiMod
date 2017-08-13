package ekazukimod.common;

import ekazukimod.common.blocks.BlockOre;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public abstract class CommonProxy {
	
	public static BlockOre copperOre;  // this holds the unique instance of your block
	public static ItemBlock itemCopperOre;
	
	public void preInit() {
		copperOre = (BlockOre)(new BlockOre(Material.ROCK).setUnlocalizedName("copperore"));
		copperOre.setRegistryName(EkazukiMod.prependModID("copperore"));
	    GameRegistry.register(copperOre);

	    // We also need to create and register an ItemBlock for this block otherwise it won't appear in the inventory
	    itemCopperOre = new ItemBlock(copperOre);
	    itemCopperOre.setRegistryName(copperOre.getRegistryName());
	    GameRegistry.register(itemCopperOre);
	    
	
	}
	
	public void init() {

	}
	
	public void postInit() {

	}
	
    abstract public boolean playerIsInCreativeMode(EntityPlayer player);

	abstract public boolean isDedicatedServer();
}
