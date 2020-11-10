package net.mugmansnarutomod.client;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ChakraRecharger extends Item {
	public ChakraRecharger(Properties properties) {
		super(properties);
	}

	private boolean isInAir;
	
	private int counter;

	@SuppressWarnings("deprecation")
	public void ChakraRecharger() {
		getMaxDamage();
		isDamageable();
		this.getMaxStackSize();
		
	}
	
	public boolean onDroppedByPlayer(ItemStack item, PlayerEntity player) {
	    return false;
	    
	}
	
	  public ItemStack onItemRightClick(ItemStack Par1ItemStack, World Par2World, PlayerEntity Par3EntityPlayer) {
		    if (!Par2World.isRemote)
		      return Par1ItemStack; 
		    return Par1ItemStack;
		  }
	
}
