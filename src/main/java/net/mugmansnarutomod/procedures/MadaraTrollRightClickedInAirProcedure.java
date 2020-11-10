package net.mugmansnarutomod.procedures;

import net.mugmansnarutomod.MugmansnarutomodModElements;

import net.minecraft.util.DamageSource;
import net.minecraft.entity.Entity;

import java.util.Map;

@MugmansnarutomodModElements.ModElement.Tag
public class MadaraTrollRightClickedInAirProcedure extends MugmansnarutomodModElements.ModElement {
	public MadaraTrollRightClickedInAirProcedure(MugmansnarutomodModElements instance) {
		super(instance, 10);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MadaraTrollRightClickedInAir!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.attackEntityFrom(DamageSource.GENERIC, (float) 99999);
	}
}
