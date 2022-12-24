package net.mcreator.galaxyrpmod.potion;

import net.mcreator.galaxyrpmod.GalaxyrpMod;
import net.mcreator.galaxyrpmod.effect.ModEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModPotions {
    public static final DeferredRegister<Potion> POTIONS
            = DeferredRegister.create(ForgeRegistries.POTIONS, GalaxyrpMod.MODID);

    public static final RegistryObject<Potion> MINIMAL_CHAKRA_RESTORE_POTION = POTIONS.register
            ("minimal_chakra_restore_potion", () -> new Potion(new MobEffectInstance(ModEffects.CHAKRA_REGEN.get(),
                    5, 0)));

    public static void register(IEventBus bus){
        POTIONS.register(bus);
    }
}



