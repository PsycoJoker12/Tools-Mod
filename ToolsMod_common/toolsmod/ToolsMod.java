package toolsmod;

import toolsmod.lib.Reference;
import toolsmod.proxy.CommonProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod( modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class ToolsMod {
    
    @Instance(Reference.MOD_ID)
    public static ToolsMod instance;
    
    @SidedProxy(clientSide = "toolsmod.proxy.ClientProxy", serverSide = "toolsmod.proxy.CommonProxy")
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event){
        
    }
    
    @EventHandler
    public void Init(FMLInitializationEvent event){
        
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event){
        
    }
}
