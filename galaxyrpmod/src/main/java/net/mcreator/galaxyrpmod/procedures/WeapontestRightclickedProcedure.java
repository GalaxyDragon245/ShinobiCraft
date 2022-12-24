package net.mcreator.galaxyrpmod.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.Arrow;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.util.RandomSource;
import net.mcreator.galaxyrpmod.chakra.PlayerChakraProvider;
import net.mcreator.galaxyrpmod.network.GalaxyrpmodModVariables;
import net.mcreator.galaxyrpmod.network.ModMessages;
import net.mcreator.galaxyrpmod.network.packet.ChakraDataSyncS2cPaket;

public class WeapontestRightclickedProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		double fromZ = 0;
		double fromX = 0;
		double fromY = 0;
		double fireHeight = 0;
		entity.getCapability(PlayerChakraProvider.PLAYER_CHAKRA).ifPresent(chakra -> {
			if(chakra.getChakra() > 9) {
				chakra.subChakra(10);
				//entity.sendSystemMessage(Component.literal("removed chakra Current: " + chakra.getChakra()));
				ModMessages.sendToPlayer(new ChakraDataSyncS2cPaket(chakra.getChakra(), chakra.getMaxChakra()), (ServerPlayer) entity);
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
						_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 5, 0);
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
			
		});
		
	}
}
