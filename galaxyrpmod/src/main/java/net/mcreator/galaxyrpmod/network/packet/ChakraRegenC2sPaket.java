package net.mcreator.galaxyrpmod.network.packet;

import net.mcreator.galaxyrpmod.client.ClientChakraData;
import net.mcreator.galaxyrpmod.effect.ModEffects;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraftforge.network.NetworkEvent;

import java.util.function.Supplier;

public class ChakraRegenC2sPaket {
	private boolean regen;

	public ChakraRegenC2sPaket(boolean regen) {
		this.regen = regen;
	}

	public ChakraRegenC2sPaket(FriendlyByteBuf buf) {
		this.regen = buf.readBoolean();
	}
	
	public void toBytes(FriendlyByteBuf buf) {
		buf.writeBoolean(this.regen);
	}
	
	public boolean handle(Supplier<NetworkEvent.Context> supplier) {
		NetworkEvent.Context context = supplier.get();
		context.enqueueWork(() ->{
			//HERE WE ARE ON THE Server
			ServerPlayer player = context.getSender();

			if (regen){
				player.sendSystemMessage(Component.literal("message recieved regen: true"));
			player.addEffect(new MobEffectInstance(ModEffects.CHAKRA_REGEN.get(),10000));
			} else {
				player.sendSystemMessage(Component.literal("message recieved regen: false"));
				player.removeEffect(ModEffects.CHAKRA_REGEN.get());
			}
		});
		return true;
		
	}

}
