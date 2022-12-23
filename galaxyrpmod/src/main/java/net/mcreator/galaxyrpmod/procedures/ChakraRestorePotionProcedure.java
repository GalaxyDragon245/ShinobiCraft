package net.mcreator.galaxyrpmod.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.galaxyrpmod.network.GalaxyrpmodModVariables;

public class ChakraRestorePotionProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			double _setval = (entity.getCapability(GalaxyrpmodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new GalaxyrpmodModVariables.PlayerVariables())).Chakra + 25;
			entity.getCapability(GalaxyrpmodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.Chakra = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			double _setval = (entity.getCapability(GalaxyrpmodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new GalaxyrpmodModVariables.PlayerVariables())).ChakraMultiplier + 1;
			entity.getCapability(GalaxyrpmodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.ChakraMultiplier = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
