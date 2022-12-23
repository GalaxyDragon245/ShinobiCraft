package net.mcreator.galaxyrpmod.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingDeathEvent;

import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.Entity;

import net.mcreator.galaxyrpmod.network.GalaxyrpmodModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class SPWorkProcedure {
	@SubscribeEvent
	public static void onEntityDeath(LivingDeathEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity());
		}
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		double energy = 0;
		if (entity instanceof Monster) {
			{
				double _setval = (entity.getCapability(GalaxyrpmodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new GalaxyrpmodModVariables.PlayerVariables())).SkillPoints + 2;
				entity.getCapability(GalaxyrpmodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.SkillPoints = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
