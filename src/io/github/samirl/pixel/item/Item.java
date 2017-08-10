package io.github.samirl.pixel.item;

import io.github.samirl.pixel.Attack;
import io.github.samirl.pixel.Player;

public abstract class Item {
	public int id;
	public int dropPercent;
	public String itemName;
	public boolean isWeapon;
	public Attack primaryAttack;
	public Attack secondaryAttack;
	public void onPrimaryAttack(Player attacker, Player target) {}
	public void onPrimaryAttack(Player attacker) {
		onPrimaryAttack(attacker, null);
	}
	public void onSecondaryAttack(Player attacker, Player target) {}
	public void onSecondaryAttack(Player attacker) {
		onSecondaryAttack(attacker, null);
	}
}