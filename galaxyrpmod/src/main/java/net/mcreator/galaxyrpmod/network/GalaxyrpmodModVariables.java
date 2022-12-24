package net.mcreator.galaxyrpmod.network;

import net.mcreator.galaxyrpmod.GalaxyrpMod;
import net.minecraftforge.network.PacketDistributor;
import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.common.util.FakePlayer;
import net.minecraftforge.common.capabilities.RegisterCapabilitiesEvent;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;
import net.minecraftforge.common.capabilities.CapabilityToken;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.common.capabilities.Capability;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.nbt.Tag;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.Direction;
import net.minecraft.client.Minecraft;

import java.util.function.Supplier;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class GalaxyrpmodModVariables {
	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		GalaxyrpMod.addNetworkMessage(PlayerVariablesSyncMessage.class, PlayerVariablesSyncMessage::buffer, PlayerVariablesSyncMessage::new,
				PlayerVariablesSyncMessage::handler);
	}

	@SubscribeEvent
	public static void init(RegisterCapabilitiesEvent event) {
		event.register(PlayerVariables.class);
	}

	@Mod.EventBusSubscriber
	public static class EventBusVariableHandlers {
		@SubscribeEvent
		public static void onPlayerLoggedInSyncPlayerVariables(PlayerEvent.PlayerLoggedInEvent event) {
			if (!event.getEntity().level.isClientSide())
				((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()))
						.syncPlayerVariables(event.getEntity());
		}

		@SubscribeEvent
		public static void onPlayerRespawnedSyncPlayerVariables(PlayerEvent.PlayerRespawnEvent event) {
			if (!event.getEntity().level.isClientSide())
				((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()))
						.syncPlayerVariables(event.getEntity());
		}

		@SubscribeEvent
		public static void onPlayerChangedDimensionSyncPlayerVariables(PlayerEvent.PlayerChangedDimensionEvent event) {
			if (!event.getEntity().level.isClientSide())
				((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()))
						.syncPlayerVariables(event.getEntity());
		}

		@SubscribeEvent
		public static void clonePlayer(PlayerEvent.Clone event) {
			event.getOriginal().revive();
			PlayerVariables original = ((PlayerVariables) event.getOriginal().getCapability(PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new PlayerVariables()));
			PlayerVariables clone = ((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new PlayerVariables()));
			clone.Chakra = original.Chakra;
			clone.ChakraMultiplier = original.ChakraMultiplier;
			clone.ChakraStart = original.ChakraStart;
			clone.EightTailsJinch = original.EightTailsJinch;
			clone.ElevenTailsJinch = original.ElevenTailsJinch;
			clone.FiveTailsJinch = original.FiveTailsJinch;
			clone.FourTailsJinch = original.FourTailsJinch;
			clone.Genjutsu = original.Genjutsu;
			clone.GrantItemOnce = original.GrantItemOnce;
			clone.isJinch = original.isJinch;
			clone.isSenju = original.isSenju;
			clone.isUchiha = original.isUchiha;
			clone.Kenjutsu = original.Kenjutsu;
			clone.MaxChakra = original.MaxChakra;
			clone.NineTailsJinch = original.NineTailsJinch;
			clone.Ninjutsu = original.Ninjutsu;
			clone.OneTailJinch = original.OneTailJinch;
			clone.setClan = original.setClan;
			clone.SevenTailsJinch = original.SevenTailsJinch;
			clone.SharinganUnlocked = original.SharinganUnlocked;
			clone.SixTailsJinch = original.SixTailsJinch;
			clone.SkillPoints = original.SkillPoints;
			clone.Taijutsu = original.Taijutsu;
			clone.TenTailsJinch = original.TenTailsJinch;
			clone.ThreeTailsJinch = original.ThreeTailsJinch;
			clone.TwoTailsJinch = original.TwoTailsJinch;
			clone.MangekyoUnlocked = original.MangekyoUnlocked;
			clone.dinoSageMode = original.dinoSageMode;
			clone.eagleSageMode = original.eagleSageMode;
			clone.hasEagleSummon = original.hasEagleSummon;
			clone.hasDinoSummon = original.hasDinoSummon;
			clone.isNinja = original.isNinja;
			clone.hasWaterRelease = original.hasWaterRelease;
			clone.hasEarthRelease = original.hasEarthRelease;
			clone.hasFireRelease = original.hasFireRelease;
			clone.hasLightningRelease = original.hasLightningRelease;
			clone.hasWindRelease = original.hasWindRelease;
			if (!event.isWasDeath()) {
			}
		}
	}

	public static final Capability<PlayerVariables> PLAYER_VARIABLES_CAPABILITY = CapabilityManager.get(new CapabilityToken<PlayerVariables>() {
	});

	@Mod.EventBusSubscriber
	private static class PlayerVariablesProvider implements ICapabilitySerializable<Tag> {
		@SubscribeEvent
		public static void onAttachCapabilities(AttachCapabilitiesEvent<Entity> event) {
			if (event.getObject() instanceof Player && !(event.getObject() instanceof FakePlayer))
				event.addCapability(new ResourceLocation("galaxyrpmod", "player_variables"), new PlayerVariablesProvider());
		}

		private final PlayerVariables playerVariables = new PlayerVariables();
		private final LazyOptional<PlayerVariables> instance = LazyOptional.of(() -> playerVariables);

		@Override
		public <T> LazyOptional<T> getCapability(Capability<T> cap, Direction side) {
			return cap == PLAYER_VARIABLES_CAPABILITY ? instance.cast() : LazyOptional.empty();
		}

		@Override
		public Tag serializeNBT() {
			return playerVariables.writeNBT();
		}

		@Override
		public void deserializeNBT(Tag nbt) {
			playerVariables.readNBT(nbt);
		}
	}

	public static class PlayerVariables {
		public double Chakra = 100.0;
		public double ChakraMultiplier = 0;
		public boolean ChakraStart = false;
		public boolean EightTailsJinch = false;
		public boolean ElevenTailsJinch = false;
		public boolean FiveTailsJinch = false;
		public boolean FourTailsJinch = false;
		public double Genjutsu = 0;
		public boolean GrantItemOnce = false;
		public boolean isJinch = false;
		public boolean isSenju = false;
		public boolean isUchiha = false;
		public double Kenjutsu = 0;
		public double MaxChakra = 100.0;
		public boolean NineTailsJinch = false;
		public double Ninjutsu = 0;
		public boolean OneTailJinch = false;
		public double setClan = 0;
		public boolean SevenTailsJinch = false;
		public boolean SharinganUnlocked = false;
		public boolean SixTailsJinch = false;
		public double SkillPoints = 0;
		public double Taijutsu = 0;
		public boolean TenTailsJinch = false;
		public boolean ThreeTailsJinch = false;
		public boolean TwoTailsJinch = false;
		public boolean MangekyoUnlocked = false;
		public boolean dinoSageMode = false;
		public boolean eagleSageMode = false;
		public boolean hasEagleSummon = false;
		public boolean hasDinoSummon = false;
		public boolean isNinja = false;
		public boolean hasWaterRelease = false;
		public boolean hasEarthRelease = false;
		public boolean hasFireRelease = false;
		public boolean hasLightningRelease = false;
		public boolean hasWindRelease = false;

		public void syncPlayerVariables(Entity entity) {
			if (entity instanceof ServerPlayer serverPlayer)
				GalaxyrpMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> serverPlayer), new PlayerVariablesSyncMessage(this));
		}

		public Tag writeNBT() {
			CompoundTag nbt = new CompoundTag();
			nbt.putDouble("Chakra", Chakra);
			nbt.putDouble("ChakraMultiplier", ChakraMultiplier);
			nbt.putBoolean("ChakraStart", ChakraStart);
			nbt.putBoolean("EightTailsJinch", EightTailsJinch);
			nbt.putBoolean("ElevenTailsJinch", ElevenTailsJinch);
			nbt.putBoolean("FiveTailsJinch", FiveTailsJinch);
			nbt.putBoolean("FourTailsJinch", FourTailsJinch);
			nbt.putDouble("Genjutsu", Genjutsu);
			nbt.putBoolean("GrantItemOnce", GrantItemOnce);
			nbt.putBoolean("isJinch", isJinch);
			nbt.putBoolean("isSenju", isSenju);
			nbt.putBoolean("isUchiha", isUchiha);
			nbt.putDouble("Kenjutsu", Kenjutsu);
			nbt.putDouble("MaxChakra", MaxChakra);
			nbt.putBoolean("NineTailsJinch", NineTailsJinch);
			nbt.putDouble("Ninjutsu", Ninjutsu);
			nbt.putBoolean("OneTailJinch", OneTailJinch);
			nbt.putDouble("setClan", setClan);
			nbt.putBoolean("SevenTailsJinch", SevenTailsJinch);
			nbt.putBoolean("SharinganUnlocked", SharinganUnlocked);
			nbt.putBoolean("SixTailsJinch", SixTailsJinch);
			nbt.putDouble("SkillPoints", SkillPoints);
			nbt.putDouble("Taijutsu", Taijutsu);
			nbt.putBoolean("TenTailsJinch", TenTailsJinch);
			nbt.putBoolean("ThreeTailsJinch", ThreeTailsJinch);
			nbt.putBoolean("TwoTailsJinch", TwoTailsJinch);
			nbt.putBoolean("MangekyoUnlocked", MangekyoUnlocked);
			nbt.putBoolean("dinoSageMode", dinoSageMode);
			nbt.putBoolean("eagleSageMode", eagleSageMode);
			nbt.putBoolean("hasEagleSummon", hasEagleSummon);
			nbt.putBoolean("hasDinoSummon", hasDinoSummon);
			nbt.putBoolean("isNinja", isNinja);
			nbt.putBoolean("hasWaterRelease", hasWaterRelease);
			nbt.putBoolean("hasEarthRelease", hasEarthRelease);
			nbt.putBoolean("hasFireRelease", hasFireRelease);
			nbt.putBoolean("hasLightningRelease", hasLightningRelease);
			nbt.putBoolean("hasWindRelease", hasWindRelease);
			return nbt;
		}

		public void readNBT(Tag Tag) {
			CompoundTag nbt = (CompoundTag) Tag;
			Chakra = nbt.getDouble("Chakra");
			ChakraMultiplier = nbt.getDouble("ChakraMultiplier");
			ChakraStart = nbt.getBoolean("ChakraStart");
			EightTailsJinch = nbt.getBoolean("EightTailsJinch");
			ElevenTailsJinch = nbt.getBoolean("ElevenTailsJinch");
			FiveTailsJinch = nbt.getBoolean("FiveTailsJinch");
			FourTailsJinch = nbt.getBoolean("FourTailsJinch");
			Genjutsu = nbt.getDouble("Genjutsu");
			GrantItemOnce = nbt.getBoolean("GrantItemOnce");
			isJinch = nbt.getBoolean("isJinch");
			isSenju = nbt.getBoolean("isSenju");
			isUchiha = nbt.getBoolean("isUchiha");
			Kenjutsu = nbt.getDouble("Kenjutsu");
			MaxChakra = nbt.getDouble("MaxChakra");
			NineTailsJinch = nbt.getBoolean("NineTailsJinch");
			Ninjutsu = nbt.getDouble("Ninjutsu");
			OneTailJinch = nbt.getBoolean("OneTailJinch");
			setClan = nbt.getDouble("setClan");
			SevenTailsJinch = nbt.getBoolean("SevenTailsJinch");
			SharinganUnlocked = nbt.getBoolean("SharinganUnlocked");
			SixTailsJinch = nbt.getBoolean("SixTailsJinch");
			SkillPoints = nbt.getDouble("SkillPoints");
			Taijutsu = nbt.getDouble("Taijutsu");
			TenTailsJinch = nbt.getBoolean("TenTailsJinch");
			ThreeTailsJinch = nbt.getBoolean("ThreeTailsJinch");
			TwoTailsJinch = nbt.getBoolean("TwoTailsJinch");
			MangekyoUnlocked = nbt.getBoolean("MangekyoUnlocked");
			dinoSageMode = nbt.getBoolean("dinoSageMode");
			eagleSageMode = nbt.getBoolean("eagleSageMode");
			hasEagleSummon = nbt.getBoolean("hasEagleSummon");
			hasDinoSummon = nbt.getBoolean("hasDinoSummon");
			isNinja = nbt.getBoolean("isNinja");
			hasWaterRelease = nbt.getBoolean("hasWaterRelease");
			hasEarthRelease = nbt.getBoolean("hasEarthRelease");
			hasFireRelease = nbt.getBoolean("hasFireRelease");
			hasLightningRelease = nbt.getBoolean("hasLightningRelease");
			hasWindRelease = nbt.getBoolean("hasWindRelease");
		}
	}

	public static class PlayerVariablesSyncMessage {
		public PlayerVariables data;

		public PlayerVariablesSyncMessage(FriendlyByteBuf buffer) {
			this.data = new PlayerVariables();
			this.data.readNBT(buffer.readNbt());
		}

		public PlayerVariablesSyncMessage(PlayerVariables data) {
			this.data = data;
		}

		public static void buffer(PlayerVariablesSyncMessage message, FriendlyByteBuf buffer) {
			buffer.writeNbt((CompoundTag) message.data.writeNBT());
		}

		public static void handler(PlayerVariablesSyncMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
			NetworkEvent.Context context = contextSupplier.get();
			context.enqueueWork(() -> {
				if (!context.getDirection().getReceptionSide().isServer()) {
					PlayerVariables variables = ((PlayerVariables) Minecraft.getInstance().player.getCapability(PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new PlayerVariables()));
					variables.Chakra = message.data.Chakra;
					variables.ChakraMultiplier = message.data.ChakraMultiplier;
					variables.ChakraStart = message.data.ChakraStart;
					variables.EightTailsJinch = message.data.EightTailsJinch;
					variables.ElevenTailsJinch = message.data.ElevenTailsJinch;
					variables.FiveTailsJinch = message.data.FiveTailsJinch;
					variables.FourTailsJinch = message.data.FourTailsJinch;
					variables.Genjutsu = message.data.Genjutsu;
					variables.GrantItemOnce = message.data.GrantItemOnce;
					variables.isJinch = message.data.isJinch;
					variables.isSenju = message.data.isSenju;
					variables.isUchiha = message.data.isUchiha;
					variables.Kenjutsu = message.data.Kenjutsu;
					variables.MaxChakra = message.data.MaxChakra;
					variables.NineTailsJinch = message.data.NineTailsJinch;
					variables.Ninjutsu = message.data.Ninjutsu;
					variables.OneTailJinch = message.data.OneTailJinch;
					variables.setClan = message.data.setClan;
					variables.SevenTailsJinch = message.data.SevenTailsJinch;
					variables.SharinganUnlocked = message.data.SharinganUnlocked;
					variables.SixTailsJinch = message.data.SixTailsJinch;
					variables.SkillPoints = message.data.SkillPoints;
					variables.Taijutsu = message.data.Taijutsu;
					variables.TenTailsJinch = message.data.TenTailsJinch;
					variables.ThreeTailsJinch = message.data.ThreeTailsJinch;
					variables.TwoTailsJinch = message.data.TwoTailsJinch;
					variables.MangekyoUnlocked = message.data.MangekyoUnlocked;
					variables.dinoSageMode = message.data.dinoSageMode;
					variables.eagleSageMode = message.data.eagleSageMode;
					variables.hasEagleSummon = message.data.hasEagleSummon;
					variables.hasDinoSummon = message.data.hasDinoSummon;
					variables.isNinja = message.data.isNinja;
					variables.hasWaterRelease = message.data.hasWaterRelease;
					variables.hasEarthRelease = message.data.hasEarthRelease;
					variables.hasFireRelease = message.data.hasFireRelease;
					variables.hasLightningRelease = message.data.hasLightningRelease;
					variables.hasWindRelease = message.data.hasWindRelease;
				}
			});
			context.setPacketHandled(true);
		}
	}
}
