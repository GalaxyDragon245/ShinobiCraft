package net.mcreator.galaxyrpmod.effect;

import net.mcreator.galaxyrpmod.chakra.PlayerChakraProvider;
import net.mcreator.galaxyrpmod.network.ModMessages;
import net.mcreator.galaxyrpmod.network.packet.ChakraDataSyncS2cPaket;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;

public class ChakraRegenEffect extends MobEffect {


    protected ChakraRegenEffect(MobEffectCategory pCategory, int pColor) {
        super(pCategory, pColor);
    }

    @Override
    public void applyEffectTick(LivingEntity pLivingEntity, int pAmplifier) {
        if(!pLivingEntity.level.isClientSide) {
            pLivingEntity.getCapability(PlayerChakraProvider.PLAYER_CHAKRA).ifPresent(chakra -> {
                if (chakra.getChakra() < chakra.getMaxChakra()) {
                    chakra.addChakra(5);
                    ModMessages.sendToPlayer(new ChakraDataSyncS2cPaket(chakra.getChakra(), chakra.getMaxChakra()), (ServerPlayer) pLivingEntity);
                    //pLivingEntity.sendSystemMessage(Component.literal("added Chakra, current: " + chakra.getChakra()));
                }
            });
        }
        super.applyEffectTick(pLivingEntity, pAmplifier);
    }

    @Override
    public boolean isDurationEffectTick(int pDuration, int pAmplifier) {
        return true;
    }
}
