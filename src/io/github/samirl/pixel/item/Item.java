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
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getDropPercent() {
		return dropPercent;
	}
	public void setDropPercent(int dropPercent) {
		this.dropPercent = dropPercent;
	}
	public String getName() {
		return itemName;
	}
	public void setName(String name) {
		this.itemName = name;
	}
	public boolean isWeapon() {
		return isWeapon;
	}
	public void setWeapon(boolean isWeapon) {
		this.isWeapon = isWeapon;
	}
	public Attack getPrimaryAttack() {
		return primaryAttack;
	}
	public void setPrimaryAttack(Attack primaryAttack) {
		this.primaryAttack = primaryAttack;
	}
	public Attack getSecondaryAttack() {
		return secondaryAttack;
	}
	public void setSecondaryAttack(Attack secondaryAttack) {
		this.secondaryAttack = secondaryAttack;
	}
}