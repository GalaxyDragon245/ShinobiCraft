package net.mcreator.galaxyrpmod.events;

import net.mcreator.galaxyrpmod.GalaxyrpMod;
import net.mcreator.galaxyrpmod.effect.ChakraRegenEffect;
import net.mcreator.galaxyrpmod.effect.ModEffects;
import net.mcreator.galaxyrpmod.network.ModMessages;
import net.mcreator.galaxyrpmod.network.packet.ChakraRegenC2sPaket;
import net.mcreator.galaxyrpmod.util.KeyBinding;
import net.minecraft.client.Minecraft;
import net.minecraft.network.chat.Component;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;




public class ClientEvents {
    @Mod.EventBusSubscriber(modid = GalaxyrpMod.MODID, value = Dist.CLIENT)
    public static class ClientForgeEvents {
        private static boolean wasDown = false;
        @SubscribeEvent
        public static void onKeyInput(InputEvent.Key event) {
            if(wasDown) {
                if (!KeyBinding.CHACKRA_REGEN_KEY.isDown()) {
                    //remove effect
                    ModMessages.sendToServer(new ChakraRegenC2sPaket(false));
                    wasDown =false;

                }
                return;
            }
            if(KeyBinding.CHACKRA_REGEN_KEY.isDown()){
                //add effect
                ModMessages.sendToServer(new ChakraRegenC2sPaket(true));
                wasDown = true;
            }
        }
    }

    @Mod.EventBusSubscriber(modid = GalaxyrpMod.MODID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ClientModBusEvents {
        @SubscribeEvent
        public static void onKeyRegister(RegisterKeyMappingsEvent event) {
            event.register(KeyBinding.CHACKRA_REGEN_KEY);
        }
    }
}
