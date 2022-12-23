
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.galaxyrpmod.item;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.galaxyrpmod.item.custom.WindReleaseGiverItem;
import net.mcreator.galaxyrpmod.item.custom.WaterReleaseGiverItem;
import net.mcreator.galaxyrpmod.item.custom.StarterKitItem;
import net.mcreator.galaxyrpmod.item.custom.NaturePaperItem;
import net.mcreator.galaxyrpmod.item.custom.MinimalChakraRestoreItem;
import net.mcreator.galaxyrpmod.item.custom.LightningReleaseGiverItem;
import net.mcreator.galaxyrpmod.item.custom.FuccItem;
import net.mcreator.galaxyrpmod.item.custom.FireReleaseGiverItem;
import net.mcreator.galaxyrpmod.item.custom.EarthReleaseGiverItem;
import net.mcreator.galaxyrpmod.item.custom.ChakratestweaponItem;
import net.mcreator.galaxyrpmod.GalaxyrpmodMod;

public class GalaxyrpmodModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, GalaxyrpmodMod.MODID);
	public static final RegistryObject<Item> MINIMAL_CHAKRA_RESTORE = REGISTRY.register("minimal_chakra_restore",
			() -> new MinimalChakraRestoreItem());
	public static final RegistryObject<Item> CHAKRATESTWEAPON = REGISTRY.register("chakratestweapon", () -> new ChakratestweaponItem());
	public static final RegistryObject<Item> STARTER_KIT = REGISTRY.register("starter_kit", () -> new StarterKitItem());
	public static final RegistryObject<Item> FUCC = REGISTRY.register("fucc", () -> new FuccItem());
	public static final RegistryObject<Item> NATURE_PAPER = REGISTRY.register("nature_paper", () -> new NaturePaperItem());
	public static final RegistryObject<Item> WATER_RELEASE_GIVER = REGISTRY.register("water_release_giver", () -> new WaterReleaseGiverItem());
	public static final RegistryObject<Item> FIRE_RELEASE_GIVER = REGISTRY.register("fire_release_giver", () -> new FireReleaseGiverItem());
	public static final RegistryObject<Item> EARTH_RELEASE_GIVER = REGISTRY.register("earth_release_giver", () -> new EarthReleaseGiverItem());
	public static final RegistryObject<Item> LIGHTNING_RELEASE_GIVER = REGISTRY.register("lightning_release_giver",
			() -> new LightningReleaseGiverItem());
	public static final RegistryObject<Item> WIND_RELEASE_GIVER = REGISTRY.register("wind_release_giver", () -> new WindReleaseGiverItem());
}
