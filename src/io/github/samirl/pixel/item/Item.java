package io.github.samirl.pixel.item;

import io.github.samirl.pixel.Attack;
import io.github.samirl.pixel.Player;

public class Item {
	private int id;
	private int dropPercent;
	private String itemName;
	private boolean isWeapon;
	private Attack primaryAttack;
	private Attack secondaryAttack;
	public void onPrimaryAttack(Player attacker, Player target) {
		if(!isWeapon) {
			return;
		}
	}
	public void onPrimaryAttack(Player attacker) {
		onPrimaryAttack(attacker, null);
	}
	public void onSecondaryAttack(Player attacker, Player target) {}
	public void onSecondaryAttack(Player attacker) {
		onSecondaryAttack(attacker, null);
	}
}