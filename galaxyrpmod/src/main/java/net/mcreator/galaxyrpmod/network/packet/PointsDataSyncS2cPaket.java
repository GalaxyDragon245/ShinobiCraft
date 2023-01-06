package net.mcreator.galaxyrpmod.network.packet;

import net.mcreator.galaxyrpmod.client.ClientChakraData;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraftforge.network.NetworkEvent;

import java.util.function.Supplier;

public class PointsDataSyncS2cPaket {
	private final int points;
	private final int kills;

	public PointsDataSyncS2cPaket(int points, int kills) {
		this.points = points;
		this.kills = kills;
	}

	public PointsDataSyncS2cPaket(FriendlyByteBuf buf) {
		this.points = buf.readInt();
		this.kills = buf.readInt();
	}
	
	public void toBytes(FriendlyByteBuf buf) {
		buf.writeInt(points);
		buf.writeInt(kills);
	}
	
	public boolean handle(Supplier<NetworkEvent.Context> supplier) {
		NetworkEvent.Context context = supplier.get();
		context.enqueueWork(() ->{
			//HERE WE ARE ON THE CLIENT
			ClientChakraData.set(points, kills);
		});
		return true;
		
	}

}
