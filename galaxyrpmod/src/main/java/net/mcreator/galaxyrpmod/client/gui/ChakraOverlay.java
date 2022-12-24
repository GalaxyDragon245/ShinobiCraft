package net.mcreator.galaxyrpmod.client.gui;

import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.PoseStack;
import net.mcreator.galaxyrpmod.client.ClientChakraData;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.client.renderer.entity.ItemRenderer;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RenderGuiEvent;
import net.minecraftforge.client.event.RenderGuiOverlayEvent;
import net.minecraftforge.client.gui.ScreenUtils;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber ({Dist.CLIENT})
public class ChakraOverlay {
    @SubscribeEvent(priority = EventPriority.NORMAL)
    public static void renderChakraBar(RenderGuiEvent.Pre event){
        double chakraPercentdouble = (((double)ClientChakraData.getPlayerChakra()/(double)ClientChakraData.getPlayerMaxChakra())*100)+1;
        int chakraPercent= (int) chakraPercentdouble;
        //Player entity = Minecraft.getInstance().player;
        //entity.sendSystemMessage(Component.literal("removed chakra Current: " + chakraPercent));
        RenderSystem.disableDepthTest();
        RenderSystem.depthMask(false);
        RenderSystem.enableBlend();
        RenderSystem.setShader(GameRenderer::getPositionTexShader);
        RenderSystem.blendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA,
                GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
        RenderSystem.setShaderColor(1, 1, 1, 1);
        if (true) {
            RenderSystem.setShaderTexture(0, new ResourceLocation("galaxyrpmod:textures/screens/hpbar.png"));
            Minecraft.getInstance().gui.blit(event.getPoseStack(), 0, 0, 0, 0, 102, 8, 256, 256);
            Minecraft.getInstance().gui.blit(event.getPoseStack(), 0, 0, 0, 8, chakraPercent, 8, 256, 256);


        }
        RenderSystem.depthMask(true);
        RenderSystem.defaultBlendFunc();
        RenderSystem.enableDepthTest();
        RenderSystem.disableBlend();
        RenderSystem.setShaderColor(1, 1, 1, 1);

    }


}
