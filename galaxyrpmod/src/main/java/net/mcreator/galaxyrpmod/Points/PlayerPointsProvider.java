package net.mcreator.galaxyrpmod.Points;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import net.minecraft.core.Direction;
import net.minecraft.nbt.CompoundTag;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.common.capabilities.CapabilityToken;
import net.minecraftforge.common.capabilities.ICapabilityProvider;
import net.minecraftforge.common.util.INBTSerializable;
import net.minecraftforge.common.util.LazyOptional;

public class PlayerPointsProvider implements ICapabilityProvider, INBTSerializable<CompoundTag>{
	public static Capability<PlayerPoints> PLAYER_POINTS = CapabilityManager.get(new CapabilityToken<PlayerPoints>() { });
	
	private PlayerPoints points = null;
	private final LazyOptional<PlayerPoints> optional = LazyOptional.of(this::createPlayerPoints);
	
	private PlayerPoints createPlayerPoints() {
		if(this.points == null) {
			this.points = new PlayerPoints();
		}
		
		return this.points;
	}
	
	
	@Override
	public @NotNull <T> LazyOptional<T> getCapability(@NotNull Capability<T> cap, @Nullable Direction side) {
		if(cap == PLAYER_POINTS) {
			return optional.cast();
		}
		
		return LazyOptional.empty();
	}
	
	
	@Override
	public CompoundTag serializeNBT() {
		CompoundTag nbt = new CompoundTag();
		createPlayerPoints().saveNBTData(nbt);
		return nbt;
	}

	@Override
	public void deserializeNBT(CompoundTag nbt) {
		createPlayerPoints().loadNBTData(nbt);
		
	}

	

}
