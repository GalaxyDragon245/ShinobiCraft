package net.mcreator.galaxyrpmod.chakra;

import net.minecraft.nbt.CompoundTag;

public class PlayerChakra {
	private int Chakra;
	private int MinChakra = 0;
	private int MaxChakra = 100;
	
	public int getChakra() {
		return Chakra;
	}
	
	public void addChakra(int add) {
		this.Chakra = Math.min(Chakra + add, MaxChakra);
	}
	
	public void subChakra(int sub) {
		this .Chakra = Math.max(Chakra - sub, MinChakra);
	}
	
	public void copyFrom(PlayerChakra source) {
		this.Chakra = source.Chakra;
	}
	
	public void saveNBTData(CompoundTag nbt) {
		nbt.putInt("chakra", Chakra);
	}
	
	public void loadNBTData(CompoundTag nbt) {
		Chakra = nbt.getInt("chakra");
	}
	
	public int getMaxChakra() {
		return MaxChakra;
	}

}
