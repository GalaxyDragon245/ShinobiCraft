package net.mcreator.galaxyrpmod.network.packet;

import java.util.function.Supplier;

import net.mcreator.galaxyrpmod.client.ClientChakraData;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraftforge.network.NetworkEvent;

public class ChakraDataSyncS2cPaket {
	private final int chakra;
	private final int maxChakra;
	
	public ChakraDataSyncS2cPaket(int chakra, int maxChakra) {
		this.chakra = chakra;
		this.maxChakra = maxChakra;
	}
	
	public ChakraDataSyncS2cPaket(FriendlyByteBuf buf) {
		this.chakra = buf.readInt();
		this.maxChakra = buf.readInt();
	}
	
	public void toBytes(FriendlyByteBuf buf) {
		buf.writeInt(chakra);
		buf.writeInt(maxChakra);
	}
	
	public boolean handle(Supplier<NetworkEvent.Context> supplier) {
		NetworkEvent.Context context = supplier.get();
		context.enqueueWork(() ->{
			//HERE WE ARE ON THE CLIENT
			ClientChakraData.set(chakra, maxChakra);
		});
		return true;
		
	}

}
