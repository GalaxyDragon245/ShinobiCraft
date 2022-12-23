
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.galaxyrpmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.galaxyrpmod.item.WindReleaseGiverItem;
import net.mcreator.galaxyrpmod.item.WaterReleaseGiverItem;
import net.mcreator.galaxyrpmod.item.StarterKitItem;
import net.mcreator.galaxyrpmod.item.NaturePaperItem;
import net.mcreator.galaxyrpmod.item.MinimalChakraRestoreItem;
import net.mcreator.galaxyrpmod.item.LightningReleaseGiverItem;
import net.mcreator.galaxyrpmod.item.FuccItem;
import net.mcreator.galaxyrpmod.item.FireReleaseGiverItem;
import net.mcreator.galaxyrpmod.item.EarthReleaseGiverItem;
import net.mcreator.galaxyrpmod.item.ChakratestweaponItem;
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
