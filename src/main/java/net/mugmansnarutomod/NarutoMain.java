package net.mugmansnarutomod;

import net.minecraft.entity.player.PlayerEntity;

public class NarutoMain {
	
	//Main Stuff
	private final PlayerEntity player;
	public static int chakra; //Chakra amount, double = n.n
	public static double maxChakraAmount = 100.0; //Maximum chakra amount
	public static int chakraCooldown; //The time amount chakra uses to reset its value to default
	public static boolean chakraCharging = false; //Is charging chakra default = false
	public static boolean chakraCharge = false; //Is charging chakra = false
	public static double bijuuChakra = 100.0; //Bijuu chakra amount
	public static double maxBijuuChakra = 100.0;
	public static int bijuuChakraCooldown;

  	public NarutoMain(PlayerEntity player) {
  		this.player = player;
  		this.chakra = 50;
  		this.chakraCooldown = 0;

	}
  	
}