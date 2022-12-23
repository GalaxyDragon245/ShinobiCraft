package net.mcreator.galaxyrpmod.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;

import net.mcreator.galaxyrpmod.network.GalaxyrpmodModVariables;

public class DepleteChakraProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if ((entity.getCapability(GalaxyrpmodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new GalaxyrpmodModVariables.PlayerVariables())).Chakra > 49) {
			{
				double _setval = (entity.getCapability(GalaxyrpmodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new GalaxyrpmodModVariables.PlayerVariables())).Chakra - 50;
				entity.getCapability(GalaxyrpmodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Chakra = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				ItemStack _ist = itemstack;
				if (_ist.hurt(0, RandomSource.create(), null)) {
					_ist.shrink(1);
					_ist.setDamageValue(0);
				}
			}
		}
	}
}
