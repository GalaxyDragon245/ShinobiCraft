package xyz.cyberraptor.shinobicraft.register;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import xyz.cyberraptor.shinobicraft.Main;

public class itemregister {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Main.MODID);

    public static final RegistryObject<Item> test = ITEMS.register("test", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));



}
