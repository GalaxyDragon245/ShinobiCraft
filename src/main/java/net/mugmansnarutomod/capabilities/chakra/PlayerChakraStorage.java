package net.mugmansnarutomod.capabilities.chakra;

public abstract class PlayerChakraStorage implements IChakra {
	
	protected double chakra;
	
	protected double maxChakra;
	
	protected double chakraCooldown;
	
	protected boolean isChakraFocus;
	
	protected boolean chakraControl;
	
	public PlayerChakraStorage(double chakra) {
		this(chakra, 50.0D);
	}
	
	public PlayerChakraStorage(double chakra, double maxChakra) {
		this(chakra, maxChakra, 100.0D);
	}
	
	public PlayerChakraStorage(double chakra, double maxChakra, double chakraCooldown) {
		this(chakra, maxChakra, chakraCooldown);
	}
	
	public PlayerChakraStorage(double chakra, double maxChakra, double chakraCooldown, boolean isChakraFocus) {
		this.chakra = chakra;
		this.maxChakra = maxChakra;
		this.chakraCooldown = chakraCooldown;
		this.isChakraFocus = false;
	}
	
	public PlayerChakraStorage(double chakra, double maxChakra, double chakraCooldown, boolean isChakraFocus, boolean chakraControl) {
		this.chakra = chakra;
		this.maxChakra = maxChakra;
		this.chakraCooldown = chakraCooldown;
		this.isChakraFocus = false;
		this.chakraControl = false;
	}
	
	public double chakraCharge(double maxChakra, boolean isChakraFocus) {
		if (isChakraFocus = true)
			chakra++;
		return 0;
	}

	public double onChakraControl(double chakra, double maxChakra, boolean chakraControl) {
		if (chakraControl = true)
			chakra--;
		return chakra;
	}

	public double getChakraStored() {
		return this.chakra;
	}

	public double getMaxChakraStored() {
		return this.maxChakra;
	}

	public boolean canCharge() {
		return (this.chakra < 100.0D);
	}
	
	public boolean canUse() {
		return true;
	}
	
}
