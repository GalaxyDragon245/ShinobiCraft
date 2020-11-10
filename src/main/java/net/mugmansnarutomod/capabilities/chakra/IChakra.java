package net.mugmansnarutomod.capabilities.chakra;

public interface IChakra {
	
	double chakraCharge(); //Is player charging chakra

	double getChakraCooldown(); //Obtain chakra cooldown
	
	double onChakraControl();
	
	double getMaxChakraStored();
	
	double getChakraStored();

	boolean canCharge(); //Can charge
	
	boolean canUse(); //Can use
	
}
