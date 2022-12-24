package net.mcreator.galaxyrpmod.network;

import net.mcreator.galaxyrpmod.GalaxyrpMod;
import net.mcreator.galaxyrpmod.network.packet.ChakraDataSyncS2cPaket;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraftforge.network.NetworkDirection;
import net.minecraftforge.network.NetworkRegistry;
import net.minecraftforge.network.PacketDistributor;
import net.minecraftforge.network.simple.SimpleChannel;

public class ModMessages {
	private static SimpleChannel Instance;
	
	private static int packetId =0;
	
	private static int id() {
		return packetId++;
	}
	
	public static void register() {
		SimpleChannel net = NetworkRegistry.ChannelBuilder
				.named(new ResourceLocation(GalaxyrpMod.MODID, "messages"))
				.networkProtocolVersion(() -> "1.0")
				.clientAcceptedVersions(s -> true)
				.serverAcceptedVersions(s -> true)
				.simpleChannel();
		
		Instance = net;
		
		net.messageBuilder(ChakraDataSyncS2cPaket.class, id(), NetworkDirection.PLAY_TO_CLIENT)
		.decoder(ChakraDataSyncS2cPaket::new)
		.encoder(ChakraDataSyncS2cPaket::toBytes)
		.consumerMainThread(ChakraDataSyncS2cPaket::handle)
		.add();
	}
	
	
	
	public static <MSG> void sendToServer(MSG message) {
		Instance.sendToServer(message);
	}
	
	public static <MSG> void sendToPlayer(MSG message, ServerPlayer player) {
		Instance.send(PacketDistributor.PLAYER.with(() -> player), message);
	}

}
