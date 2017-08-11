package io.github.samirl.pixel.item;

import java.io.File;

import io.github.samirl.pixel.Attack;
import io.github.samirl.pixel.Player;

public class Item {
	private int id;
	private int dropPercent;
	private String itemName;
	private boolean isWeapon;
	private Attack primaryAttack;
	private Attack secondaryAttack;
	private File sprite;
	private double[] location;
	private boolean isHeld;
	private Player holder;
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
	public File getSprite() {
		return sprite;
	}
	public boolean getIsHeld() {
		if(holder == null) {
			isHeld = false;
		}
		return isHeld;
	}
	public double[] getLocation() {
		if(isHeld) {
			location = holder.getLocation();
		}
		return location;
	}
	public Player getHolder() {
		return this.holder;
	}
	public void setHolder(Player newHolder) {
		if(newHolder == null) {
			this.setIsHeld(false);
		}
		this.holder = newHolder;
	}
	private void setIsHeld(boolean nowIsHeld) {
		this.isHeld = nowIsHeld;
	}
}