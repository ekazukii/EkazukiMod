package ekazukimod.common;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = EkazukiMod.MODID, version = EkazukiMod.VERSION)
public class EkazukiMod {
	
	   public static final String MODID = "ekazukimod";
	   public static final String VERSION = "1.11.2";
	   
	    @Mod.Instance(EkazukiMod.MODID)
	    public static EkazukiMod instance;

	    // Says where the client and server 'proxy' code is loaded.
	    @SidedProxy(clientSide="ekazukimod.common.ClientProxy", serverSide="ekazukidmod.common.ServerProxy")
	    public static CommonProxy proxy;

	    @EventHandler
	    public void preInit(FMLPreInitializationEvent event)
	    {
	      proxy.preInit();
	    }

	    @EventHandler
	    public void init(FMLInitializationEvent event)
	    {
	      proxy.init();
	    }

	    @EventHandler
	    public void postInit(FMLPostInitializationEvent event)
	    {
	      proxy.postInit();
	    }

	    /**
	     * Prepend the name with the mod ID, suitable for ResourceLocations such as textures.
	     * @param name
	     * @return eg "minecraftbyexample:myblockname"
	     */
	public static String prependModID(String name) {return MODID + ":" + name;}

}


