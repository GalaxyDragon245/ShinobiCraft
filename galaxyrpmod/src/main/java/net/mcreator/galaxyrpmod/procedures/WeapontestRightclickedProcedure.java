package net.mcreator.galaxyrpmod.procedures;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.Arrow;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;

import net.mcreator.galaxyrpmod.network.GalaxyrpmodModVariables;

public class WeapontestRightclickedProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		double fromZ = 0;
		double fromX = 0;
		double fromY = 0;
		double fireHeight = 0;
		if ((entity.getCapability(GalaxyrpmodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new GalaxyrpmodModVariables.PlayerVariables())).Chakra > 9) {
			{
				double _setval = (entity.getCapability(GalaxyrpmodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new GalaxyrpmodModVariables.PlayerVariables())).Chakra - 10;
				entity.getCapability(GalaxyrpmodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Chakra = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				Entity _shootFrom = entity;
				Level projectileLevel = _shootFrom.level;
				if (!projectileLevel.isClientSide()) {
					Projectile _entityToSpawn = new Object() {
						public Projectile getArrow(Level level, float damage, int knockback) {
							AbstractArrow entityToSpawn = new Arrow(EntityType.ARROW, level);
							entityToSpawn.setBaseDamage(damage);
							entityToSpawn.setKnockback(knockback);
							return entityToSpawn;
						}
					}.getArrow(projectileLevel, 30, 1);
					_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
					_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 1, 0);
					projectileLevel.addFreshEntity(_entityToSpawn);
				}
			}
			{
				ItemStack _ist = itemstack;
				if (_ist.hurt(0, RandomSource.create(), null)) {
					_ist.shrink(1);
					_ist.setDamageValue(0);
				}
			}
		}
	}
}
