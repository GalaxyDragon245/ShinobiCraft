
package net.mugmansnarutomod.potion;

import net.mugmansnarutomod.procedures.BijuuPowerPotionPotionStartedappliedProcedure;
import net.mugmansnarutomod.MugmansnarutomodModElements;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.World;
import net.minecraft.util.ResourceLocation;
import net.minecraft.potion.Potion;
import net.minecraft.potion.EffectType;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effect;
import net.minecraft.entity.ai.attributes.AbstractAttributeMap;
import net.minecraft.entity.LivingEntity;

import java.util.Map;
import java.util.HashMap;

@MugmansnarutomodModElements.ModElement.Tag
public class BijuuPowerPotionPotion extends MugmansnarutomodModElements.ModElement {
	@ObjectHolder("mugmansnarutomod:bijuu_power_potion")
	public static final Effect potion = null;
	@ObjectHolder("mugmansnarutomod:bijuu_power_potion")
	public static final Potion potionType = null;
	public BijuuPowerPotionPotion(MugmansnarutomodModElements instance) {
		super(instance, 5);
		FMLJavaModLoadingContext.get().getModEventBus().register(this);
	}

	@SubscribeEvent
	public void registerEffect(RegistryEvent.Register<Effect> event) {
		event.getRegistry().register(new EffectCustom());
	}

	@SubscribeEvent
	public void registerPotion(RegistryEvent.Register<Potion> event) {
		event.getRegistry().register(new PotionCustom());
	}
	public static class PotionCustom extends Potion {
		public PotionCustom() {
			super(new EffectInstance(potion, 3600));
			setRegistryName("bijuu_power_potion");
		}
	}

	public static class EffectCustom extends Effect {
		private final ResourceLocation potionIcon;
		public EffectCustom() {
			super(EffectType.NEUTRAL, -3014656);
			setRegistryName("bijuu_power_potion");
			potionIcon = new ResourceLocation("mugmansnarutomod:textures/health_boost.png");
		}

		@Override
		public String getName() {
			return "effect.bijuu_power_potion";
		}

		@Override
		public boolean isBeneficial() {
			return false;
		}

		@Override
		public boolean isInstant() {
			return false;
		}

		@Override
		public boolean shouldRenderInvText(EffectInstance effect) {
			return false;
		}

		@Override
		public boolean shouldRender(EffectInstance effect) {
			return false;
		}

		@Override
		public boolean shouldRenderHUD(EffectInstance effect) {
			return false;
		}

		@Override
		public void applyAttributesModifiersToEntity(LivingEntity entity, AbstractAttributeMap attributeMapIn, int amplifier) {
			World world = entity.world;
			double x = entity.getPosX();
			double y = entity.getPosY();
			double z = entity.getPosZ();
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				BijuuPowerPotionPotionStartedappliedProcedure.executeProcedure($_dependencies);
			}
		}

		@Override
		public boolean isReady(int duration, int amplifier) {
			return true;
		}
	}
}
