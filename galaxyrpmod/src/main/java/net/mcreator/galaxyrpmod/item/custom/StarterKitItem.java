
package net.mcreator.galaxyrpmod.item.custom;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;

import net.mcreator.galaxyrpmod.procedures.SetNinjaStatusProcedure;
import net.mcreator.galaxyrpmod.init.GalaxyrpmodModTabs;

public class StarterKitItem extends Item {
	public StarterKitItem() {
		super(new Item.Properties().tab(GalaxyrpmodModTabs.TAB_SHINOBI_CRAFT).stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		ItemStack itemstack = ar.getObject();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		SetNinjaStatusProcedure.execute();
		return ar;
	}
}
