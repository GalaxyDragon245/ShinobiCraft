package net.mcreator.galaxyrpmod.events;



import net.mcreator.galaxyrpmod.GalaxyrpmodMod;
import net.mcreator.galaxyrpmod.chakra.PlayerChakra;
import net.mcreator.galaxyrpmod.chakra.PlayerChakraProvider;
import net.mcreator.galaxyrpmod.network.ModMessages;
import net.mcreator.galaxyrpmod.network.packet.ChakraDataSyncS2cPaket;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.common.capabilities.RegisterCapabilitiesEvent;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.event.entity.EntityJoinLevelEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.LogicalSide;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = GalaxyrpmodMod.MODID)
public class ModEvents {
	
	@SubscribeEvent
	public static void onAttachCapabilitiesPlayer(AttachCapabilitiesEvent<Entity> event) {
		if(event.getObject() instanceof Player) {
			if(!event.getObject().getCapability(PlayerChakraProvider.PLAYER_CHAKRA).isPresent()) {
				event.addCapability(new ResourceLocation(GalaxyrpmodMod.MODID, "properties"), new PlayerChakraProvider());
			}
		}
	}
	
	@SubscribeEvent
	public static void onPlayerCloned(PlayerEvent.Clone event) {
		if (event.isWasDeath()) {
			event.getOriginal().getCapability(PlayerChakraProvider.PLAYER_CHAKRA).ifPresent(oldStore -> {
				event.getOriginal().getCapability(PlayerChakraProvider.PLAYER_CHAKRA).ifPresent(newStore -> {
					newStore.copyFrom(oldStore);
				});
			});
		}
	}
	
	@SubscribeEvent
	public static void onRegisterCapabilities(RegisterCapabilitiesEvent event) {
		event.register(PlayerChakra.class);
	}
	
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.side == LogicalSide.SERVER) {
			event.player.getCapability(PlayerChakraProvider.PLAYER_CHAKRA).ifPresent(chakra -> {
				if(chakra.getChakra() < chakra.getMaxChakra() && event.player.getRandom().nextFloat() < 0.1f ) {
					chakra.addChakra(1);
					ModMessages.sendToPlayer(new ChakraDataSyncS2cPaket(chakra.getChakra(), chakra.getMaxChakra()), (ServerPlayer) event.player);
					//event.player.sendSystemMessage(Component.literal("added Chakra, current: " + chakra.getChakra() ));
				}
			});
		}
	}
	
	@SubscribeEvent
	public static void onPlayerJoinWorld(EntityJoinLevelEvent event) {
		if(!event.getLevel().isClientSide) {
			if(event.getEntity() instanceof ServerPlayer player) {
				player.getCapability(PlayerChakraProvider.PLAYER_CHAKRA).ifPresent(chakra -> {
					ModMessages.sendToPlayer(new ChakraDataSyncS2cPaket(chakra.getChakra(), chakra.getMaxChakra()), player);
				});
			}
		}
	}

}
