package net.mcreator.galaxyrpmod.effect;


import net.mcreator.galaxyrpmod.GalaxyrpMod;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEffects {
    public static final DeferredRegister<MobEffect> MOB_EFFECTS
            = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, GalaxyrpMod.MODID);

    public static final RegistryObject<MobEffect> CHAKRA_REGEN = MOB_EFFECTS.register("chakra_regen",
            () -> new ChakraRegenEffect(MobEffectCategory.BENEFICIAL, 3124687));

    public static final RegistryObject<MobEffect> CHAKRA_KEY_REGEN = MOB_EFFECTS.register("chakra_key_regen",
            () -> new ChakraRegenEffect(MobEffectCategory.BENEFICIAL, 0));

    public static void register(IEventBus bus){
        MOB_EFFECTS.register(bus);
    }
}
