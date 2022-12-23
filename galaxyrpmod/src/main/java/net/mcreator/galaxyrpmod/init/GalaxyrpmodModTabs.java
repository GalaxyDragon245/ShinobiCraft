
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.galaxyrpmod.init;

import net.mcreator.galaxyrpmod.item.GalaxyrpmodModItems;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class GalaxyrpmodModTabs {
	public static CreativeModeTab TAB_SHINOBI_CRAFT;

	public static void load() {
		TAB_SHINOBI_CRAFT = new CreativeModeTab("tabshinobi_craft") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(GalaxyrpmodModItems.FUCC.get());
			}

			@Override
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
	}
}
