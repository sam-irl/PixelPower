package io.github.samirl.pixel.item;

import io.github.samirl.pixel.Attack;

public class Rifle extends Item {
	private int id = 2;
	private int dropPercent = 20;
	private String itemName = "Rifle";
	private boolean isWeapon = true;
	private Attack primaryAttack = new Attack("Fire Rifle", 5, false, true, true);
	private Attack secondaryAttack = new Attack("Bayonet", 3, true, false, false);
	public void onPrimaryAttack() {
		
	}
	public void onSecondaryAttack() {
		
	}
}
