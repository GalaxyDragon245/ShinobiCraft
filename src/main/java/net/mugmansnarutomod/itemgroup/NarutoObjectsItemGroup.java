
package net.mugmansnarutomod.itemgroup;

import net.mugmansnarutomod.item.RyoCurrencyItem;
import net.mugmansnarutomod.MugmansnarutomodModElements;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

@MugmansnarutomodModElements.ModElement.Tag
public class NarutoObjectsItemGroup extends MugmansnarutomodModElements.ModElement {
	public NarutoObjectsItemGroup(MugmansnarutomodModElements instance) {
		super(instance, 3);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabnaruto_objects") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(RyoCurrencyItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
