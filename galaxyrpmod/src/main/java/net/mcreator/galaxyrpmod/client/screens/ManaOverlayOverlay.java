
package net.mcreator.galaxyrpmod.client.screens;

import com.mojang.blaze3d.vertex.PoseStack;
import org.checkerframework.checker.units.qual.h;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.client.event.RenderGuiEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.client.Minecraft;
import net.mcreator.galaxyrpmod.chakra.PlayerChakraProvider;
import net.mcreator.galaxyrpmod.client.ClientChakraData;
import net.mcreator.galaxyrpmod.network.GalaxyrpmodModVariables;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class ManaOverlayOverlay {
	
	
	@SubscribeEvent(priority = EventPriority.NORMAL)
	public static void eventHandler(RenderGuiEvent.Pre event) {
		int currentChakra =0;
		int maxChakra =0;
		int w = event.getWindow().getGuiScaledWidth();
		int h = event.getWindow().getGuiScaledHeight();
		int posX = w / 2;
		int posY = h / 2;
		Level _world = null;
		double _x = 0;
		double _y = 0;
		double _z = 0;
		Player entity = Minecraft.getInstance().player;
		if (entity != null) {
			_world = entity.level;
			_x = entity.getX();
			_y = entity.getY();
			_z = entity.getZ();
		}
		Level world = _world;
		double x = _x;
		double y = _y;
		double z = _z;
		PoseStack pose = event.getPoseStack();
		pose.pushPose();
		pose.scale(0.5f,0.5f,0.5f);
		Minecraft.getInstance().font.draw(pose,
				ClientChakraData.getPlayerChakra() + "/" + ClientChakraData.getPlayerMaxChakra(),
				75, 4, -16737793);
		pose.popPose();
//		if (true) {
//			Minecraft.getInstance().font.draw(event.getPoseStack(),
//					"" + (int) ((entity.getCapability(GalaxyrpmodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
//							.orElse(new GalaxyrpmodModVariables.PlayerVariables())).Chakra) + "",
//					posX + -207, posY + 95, -1673779);
//			Minecraft.getInstance().font.draw(event.getPoseStack(),
//					"" + (int) ((entity.getCapability(GalaxyrpmodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
//							.orElse(new GalaxyrpmodModVariables.PlayerVariables())).MaxChakra) + "",
//					posX + -207, posY + 77, -16737793);
//			Minecraft.getInstance().font.draw(event.getPoseStack(), "/", posX + -162, posY + 86, -16724737);
//		}
	}
}
