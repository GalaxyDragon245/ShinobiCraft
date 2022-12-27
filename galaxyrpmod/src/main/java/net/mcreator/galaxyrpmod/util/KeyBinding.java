package net.mcreator.galaxyrpmod.util;

import com.mojang.blaze3d.platform.InputConstants;
import net.minecraft.client.KeyMapping;
import net.minecraftforge.client.settings.KeyConflictContext;
import org.lwjgl.glfw.GLFW;

public class KeyBinding {
    public static final String KEY_CATEGORY_TUTORIAL = "key.category.galaxyrpmdod.galaxyrpmod";
    public static final String KEY_CHAKRA_REGEN = "key.galaxyrpmod.chakra_regen_key";

    public static final KeyMapping CHACKRA_REGEN_KEY = new KeyMapping(KEY_CHAKRA_REGEN, KeyConflictContext.IN_GAME,
            InputConstants.Type.KEYSYM, GLFW.GLFW_KEY_C, KEY_CATEGORY_TUTORIAL);
}
