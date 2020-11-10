
package net.mugmansnarutomod.item;

import net.mugmansnarutomod.itemgroup.NarutoObjectsItemGroup;
import net.mugmansnarutomod.MugmansnarutomodModElements;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

@MugmansnarutomodModElements.ModElement.Tag
public class ChakraShardItem extends MugmansnarutomodModElements.ModElement {
	@ObjectHolder("mugmansnarutomod:chakra_shard")
	public static final Item block = null;
	public ChakraShardItem(MugmansnarutomodModElements instance) {
		super(instance, 22);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(NarutoObjectsItemGroup.tab).maxStackSize(64));
			setRegistryName("chakra_shard");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
