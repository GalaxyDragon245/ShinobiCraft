package net.mcreator.galaxyrpmod.Points;

import net.mcreator.galaxyrpmod.config.ModCommonConfigs;
import net.minecraft.nbt.CompoundTag;

public class PlayerPoints {
	private int Points = 0;
	private int Kills = 0;
	private static final int KillsPerPoint = ModCommonConfigs.MOB_KILLS_PER_POINT.get();
	public int getPoints() {
		return Points;
	}
	
	public void addKill(int add) {
		this.Kills += add;
		if(this.Kills >= KillsPerPoint){
			Points += (Kills / KillsPerPoint);
			Kills =  Kills % KillsPerPoint;
		}
	}
	
	public void subPoints(int sub) {
		this.Points = Math.min(this.Points - sub, 0);
	}
	
	public void copyFrom(PlayerPoints source) {

		this.Points = source.Points;
		this.Kills = source.Kills;
	}
	
	public void saveNBTData(CompoundTag nbt)
	{
		nbt.putInt("points", Points);
		nbt.putInt("kills", Kills);
	}
	
	public void loadNBTData(CompoundTag nbt) {

		Points = nbt.getInt("points");
		Kills = nbt.getInt("kills");
	}


}
