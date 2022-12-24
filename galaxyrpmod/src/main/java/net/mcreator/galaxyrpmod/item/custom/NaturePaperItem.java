
package net.mcreator.galaxyrpmod.item.custom;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;

import net.mcreator.galaxyrpmod.procedures.NaturePaperRightclickedProcedure;
import net.mcreator.galaxyrpmod.init.GalaxyrpmodModTabs;

public class NaturePaperItem extends Item {
	public NaturePaperItem(Properties properties) {
		super(properties);
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		ItemStack itemstack = ar.getObject();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		NaturePaperRightclickedProcedure.execute();
		return ar;
	}
}
