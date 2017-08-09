package io.github.samirl.pixel.item;

import io.github.samirl.pixel.Attack;

public interface Item {
	public int id = -1;
	public int dropPercent = 0;
	public String itemName = "INVALID_NAME";
	public boolean isWeapon = true;
	public Attack primaryAttack = null;
	public Attack secondaryAttack = null;
}