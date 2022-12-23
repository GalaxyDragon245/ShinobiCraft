
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.galaxyrpmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.galaxyrpmod.world.inventory.CharacterSheetMenu;
import net.mcreator.galaxyrpmod.GalaxyrpmodMod;

public class GalaxyrpmodModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, GalaxyrpmodMod.MODID);
	public static final RegistryObject<MenuType<CharacterSheetMenu>> CHARACTER_SHEET = REGISTRY.register("character_sheet",
			() -> IForgeMenuType.create(CharacterSheetMenu::new));
}
