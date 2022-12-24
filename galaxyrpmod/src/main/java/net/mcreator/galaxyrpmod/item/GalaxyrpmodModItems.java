
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.galaxyrpmod.item;

import net.mcreator.galaxyrpmod.GalaxyrpMod;
import net.mcreator.galaxyrpmod.init.GalaxyrpmodModTabs;
import net.minecraft.world.food.FoodProperties;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.galaxyrpmod.item.custom.StarterKitItem;
import net.mcreator.galaxyrpmod.item.custom.NaturePaperItem;
import net.mcreator.galaxyrpmod.item.custom.MinimalChakraRestoreItem;
import net.mcreator.galaxyrpmod.item.custom.FuccItem;
import net.mcreator.galaxyrpmod.item.custom.ChakratestweaponItem;

public class GalaxyrpmodModItems {

	public static final DeferredRegister<Item> ITEMS =
			DeferredRegister.create(ForgeRegistries.ITEMS, GalaxyrpMod.MODID);
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, GalaxyrpMod.MODID);

	//public static final RegistryObject<Item> MINIMAL_CHAKRA_RESTORE = ITEMS.register("minimal_chakra_restore",
	//		() -> new MinimalChakraRestoreItem(new Item.Properties().tab(GalaxyrpmodModTabs.TAB_SHINOBI_CRAFT).
	//				food((new FoodProperties.Builder()).nutrition(4).saturationMod(0.3f).alwaysEat()
	//						.build())));

	public static final RegistryObject<Item> CHAKRATESTWEAPON = ITEMS.register("chakratestweapon",
			() -> new ChakratestweaponItem(new Item.Properties().tab(GalaxyrpmodModTabs.TAB_SHINOBI_CRAFT)));

	public static final RegistryObject<Item> STARTER_KIT = ITEMS.register("starter_kit",
			() -> new StarterKitItem(new Item.Properties().tab(GalaxyrpmodModTabs.TAB_SHINOBI_CRAFT)));

	public static final RegistryObject<Item> FUCC = ITEMS.register("fucc",
			() -> new FuccItem(new Item.Properties().tab(GalaxyrpmodModTabs.TAB_SHINOBI_CRAFT)));

	public static final RegistryObject<Item> NATURE_PAPER = ITEMS.register("nature_paper",
			() -> new NaturePaperItem(new Item.Properties().tab(GalaxyrpmodModTabs.TAB_SHINOBI_CRAFT)));

	public static final RegistryObject<Item> WATER_RELEASE_GIVER = ITEMS.register("water_release_giver",
			() -> new Item(new Item.Properties().tab(GalaxyrpmodModTabs.TAB_SHINOBI_CRAFT)));

	public static final RegistryObject<Item> FIRE_RELEASE_GIVER = ITEMS.register("fire_release_giver",
			() -> new Item(new Item.Properties().tab(GalaxyrpmodModTabs.TAB_SHINOBI_CRAFT)));

	public static final RegistryObject<Item> EARTH_RELEASE_GIVER = ITEMS.register("earth_release_giver",
			() -> new Item(new Item.Properties().tab(GalaxyrpmodModTabs.TAB_SHINOBI_CRAFT)));

	public static final RegistryObject<Item> LIGHTNING_RELEASE_GIVER = ITEMS.register("lightning_release_giver",
			() -> new Item(new Item.Properties().tab(GalaxyrpmodModTabs.TAB_SHINOBI_CRAFT)));

	public static final RegistryObject<Item> WIND_RELEASE_GIVER = ITEMS.register("wind_release_giver",
			() -> new Item(new Item.Properties().tab(GalaxyrpmodModTabs.TAB_SHINOBI_CRAFT)));

	//public static final RegistryObject<Item> MINIMAL_CHAKRA_RESTORE = REGISTRY.register("minimal_chakra_restore", () -> new MinimalChakraRestoreItem());
	//public static final RegistryObject<Item> CHAKRATESTWEAPON = REGISTRY.register("chakratestweapon", () -> new ChakratestweaponItem());
	//public static final RegistryObject<Item> STARTER_KIT = REGISTRY.register("starter_kit", () -> new StarterKitItem());
	//public static final RegistryObject<Item> FUCC = REGISTRY.register("fucc", () -> new FuccItem());
	//public static final RegistryObject<Item> NATURE_PAPER = REGISTRY.register("nature_paper", () -> new NaturePaperItem());
	//public static final RegistryObject<Item> WATER_RELEASE_GIVER = REGISTRY.register("water_release_giver", () -> new WaterReleaseGiverItem());
	//public static final RegistryObject<Item> FIRE_RELEASE_GIVER = REGISTRY.register("fire_release_giver", () -> new FireReleaseGiverItem());
	//public static final RegistryObject<Item> EARTH_RELEASE_GIVER = REGISTRY.register("earth_release_giver", () -> new EarthReleaseGiverItem());
	//public static final RegistryObject<Item> LIGHTNING_RELEASE_GIVER = REGISTRY.register("lightning_release_giver",() -> new LightningReleaseGiverItem());
	//ublic static final RegistryObject<Item> WIND_RELEASE_GIVER = REGISTRY.register("wind_release_giver", () -> new WindReleaseGiverItem());

	public static void register(IEventBus eventBus){
		ITEMS.register(eventBus);
	}
}
