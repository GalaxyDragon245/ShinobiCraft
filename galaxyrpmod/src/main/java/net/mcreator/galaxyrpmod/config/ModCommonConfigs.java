package net.mcreator.galaxyrpmod.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class ModCommonConfigs {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    public static final ForgeConfigSpec.ConfigValue<Integer> MOB_KILLS_PER_POINT;

    static{
        BUILDER.push("Configs for Galaxy RP Mod");

        MOB_KILLS_PER_POINT = BUILDER.comment("How many mobs must you kill to get a Point?")
                .define("mobs per point", 7);

        BUILDER.pop();
        SPEC = BUILDER.build();
    }
}
