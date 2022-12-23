package net.mcreator.galaxyrpmod.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.galaxyrpmod.network.GalaxyrpmodModVariables;
import net.mcreator.galaxyrpmod.GalaxyrpmodMod;

public class SetNinjaProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(GalaxyrpmodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new GalaxyrpmodModVariables.PlayerVariables())).isNinja == false) {
			{
				boolean _setval = true;
				entity.getCapability(GalaxyrpmodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.isNinja = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 1;
				entity.getCapability(GalaxyrpmodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Ninjutsu = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 1;
				entity.getCapability(GalaxyrpmodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Genjutsu = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 1;
				entity.getCapability(GalaxyrpmodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Kenjutsu = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 1;
				entity.getCapability(GalaxyrpmodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Taijutsu = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 0;
				entity.getCapability(GalaxyrpmodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.SkillPoints = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				boolean _setval = false;
				entity.getCapability(GalaxyrpmodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.isJinch = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			GalaxyrpmodMod.LOGGER.info("You Became a Ninja!");
		}
	}
}
