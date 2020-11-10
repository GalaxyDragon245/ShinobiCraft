
package net.mugmansnarutomod.itemgroup;

import net.mugmansnarutomod.item.MadaraTrollItem;
import net.mugmansnarutomod.MugmansnarutomodModElements;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

@MugmansnarutomodModElements.ModElement.Tag
public class NarutoBuildingsItemGroup extends MugmansnarutomodModElements.ModElement {
	public NarutoBuildingsItemGroup(MugmansnarutomodModElements instance) {
		super(instance, 20);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabnaruto_buildings") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(MadaraTrollItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static ItemGroup tab;
}
