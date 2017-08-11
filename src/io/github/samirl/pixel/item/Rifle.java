package io.github.samirl.pixel.item;

import io.github.samirl.pixel.Attack;
import io.github.samirl.pixel.exception.IllegalAttackConstructorException;

public class Rifle extends Item {
	private int id = 2;
	private int dropPercent = 20;
	private String itemName = "Rifle";
	private boolean isWeapon = true;
	private Attack primaryAttack;
	private Attack secondaryAttack;
	public Rifle() {
		try {
			this.primaryAttack = new Attack("Fire Rifle", 5, false, true, true);
			this.secondaryAttack = new Attack("Bayonet", 3, true, false, false);
		} catch (IllegalAttackConstructorException e) {
			this.primaryAttack = null;
			this.secondaryAttack = null;
		}
	}
	public void onPrimaryAttack() {
		
	}
	public void onSecondaryAttack() {
		
	}
}
