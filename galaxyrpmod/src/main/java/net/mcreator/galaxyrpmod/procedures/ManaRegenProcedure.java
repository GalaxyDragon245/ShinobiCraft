package net.mcreator.galaxyrpmod.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.galaxyrpmod.network.GalaxyrpmodModVariables;
import net.mcreator.galaxyrpmod.GalaxyrpmodMod;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class ManaRegenProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level, event.player);
		}
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(GalaxyrpmodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new GalaxyrpmodModVariables.PlayerVariables())).Chakra < (entity
						.getCapability(GalaxyrpmodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new GalaxyrpmodModVariables.PlayerVariables())).MaxChakra) {
			GalaxyrpmodMod.queueServerWork(1, () -> {
				{
					double _setval = (entity.getCapability(GalaxyrpmodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new GalaxyrpmodModVariables.PlayerVariables())).Chakra + 0.01;
					entity.getCapability(GalaxyrpmodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.Chakra = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			});
		}
	}
}
