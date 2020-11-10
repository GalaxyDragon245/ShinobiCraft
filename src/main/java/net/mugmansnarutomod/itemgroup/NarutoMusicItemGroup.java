
package net.mugmansnarutomod.itemgroup;

import net.mugmansnarutomod.item.SexynessItem;
import net.mugmansnarutomod.MugmansnarutomodModElements;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

@MugmansnarutomodModElements.ModElement.Tag
public class NarutoMusicItemGroup extends MugmansnarutomodModElements.ModElement {
	public NarutoMusicItemGroup(MugmansnarutomodModElements instance) {
		super(instance, 4);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabnaruto_music") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(SexynessItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
