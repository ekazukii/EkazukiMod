package ekazukimod.common;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraftforge.client.model.ModelLoader;

public class ClientProxy extends CommonProxy{
	public void preInit() {
		super.preInit();
		
		ModelResourceLocation itemModelResourceLocation = new ModelResourceLocation(EkazukiMod.prependModID("copperore"), "inventory");
	    final int DEFAULT_ITEM_SUBTYPE = 0;
	    ModelLoader.setCustomModelResourceLocation(CommonProxy.itemCopperOre, DEFAULT_ITEM_SUBTYPE, itemModelResourceLocation);
	}
	
	public void init() {
		super.init();
	}
	
	public void postInit() {
		super.postInit();
	}
	
	@Override
	public boolean playerIsInCreativeMode(EntityPlayer player) {
		if (player instanceof EntityPlayerMP) {
			EntityPlayerMP entityPlayerMP = (EntityPlayerMP)player;
			return entityPlayerMP.interactionManager.isCreative();
		} else if (player instanceof EntityPlayerSP) {
			return Minecraft.getMinecraft().playerController.isInCreativeMode();
		}
		return false;
	}

	@Override
	public boolean isDedicatedServer() {return false;}

}
