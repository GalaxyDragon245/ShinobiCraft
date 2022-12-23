package net.mcreator.galaxyrpmod.procedures;

import net.minecraftforge.items.ItemHandlerHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.galaxyrpmod.network.GalaxyrpmodModVariables;
import net.mcreator.galaxyrpmod.item.GalaxyrpmodModItems;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class StarterItemsProcedure {
	@SubscribeEvent
	public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
		execute(event, event.getEntity());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(GalaxyrpmodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new GalaxyrpmodModVariables.PlayerVariables())).GrantItemOnce == false) {
			{
				boolean _setval = true;
				entity.getCapability(GalaxyrpmodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.GrantItemOnce = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(GalaxyrpmodModItems.STARTER_KIT.get());
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		}
	}
}
