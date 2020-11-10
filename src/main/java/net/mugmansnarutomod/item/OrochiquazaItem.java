
package net.mugmansnarutomod.item;

import net.mugmansnarutomod.itemgroup.NarutoObjectsItemGroup;
import net.mugmansnarutomod.MugmansnarutomodModElements;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.Rarity;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;

@MugmansnarutomodModElements.ModElement.Tag
public class OrochiquazaItem extends MugmansnarutomodModElements.ModElement {
	@ObjectHolder("mugmansnarutomod:orochiquaza")
	public static final Item block = null;
	public OrochiquazaItem(MugmansnarutomodModElements instance) {
		super(instance, 11);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}
	public static class MusicDiscItemCustom extends MusicDiscItem {
		public MusicDiscItemCustom() {
			super(0, MugmansnarutomodModElements.sounds.get(new ResourceLocation("mugmansnarutomod:orochiquaza")),
					new Item.Properties().group(NarutoObjectsItemGroup.tab).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("orochiquaza");
		}

		@Override
		@OnlyIn(Dist.CLIENT)
		public boolean hasEffect(ItemStack itemstack) {
			return true;
		}
	}
}
