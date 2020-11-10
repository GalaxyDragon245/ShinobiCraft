
package net.mugmansnarutomod.item;

import net.mugmansnarutomod.itemgroup.NarutoMusicItemGroup;
import net.mugmansnarutomod.MugmansnarutomodModElements;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.Rarity;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.Item;

@MugmansnarutomodModElements.ModElement.Tag
public class SexynessItem extends MugmansnarutomodModElements.ModElement {
	@ObjectHolder("mugmansnarutomod:sexyness")
	public static final Item block = null;
	public SexynessItem(MugmansnarutomodModElements instance) {
		super(instance, 2);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}
	public static class MusicDiscItemCustom extends MusicDiscItem {
		public MusicDiscItemCustom() {
			super(0, MugmansnarutomodModElements.sounds.get(new ResourceLocation("mugmansnarutomod:sexiness")),
					new Item.Properties().group(NarutoMusicItemGroup.tab).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("sexyness");
		}
	}
}
