package io.github.samirl.pixel.item;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import io.github.samirl.pixel.util.Utilities;

import io.github.samirl.pixel.Attack;
import io.github.samirl.pixel.Player;

public class Shotgun extends Item {
	Utilities util = new Utilities();
	private int id = 0;
	private int dropPercent = 25;
	private String name = "Shotgun";
	private boolean isWeapon = true;
	private final File sprite = new File("../../../../../assets/sprites/shotgun.png");
	private Attack primaryAttack = new Attack("Fire Shotgun", 5, false, true, true);
	private Attack secondaryAttack = new Attack("Bayonet", 3, true, false, false);
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
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public void onPrimaryAttack(Player target) {
		Projectile bullet0 = new Projectile(util.makeArray((double) 5, 0), 3);
		Projectile bullet1 = new Projectile(util.makeArray((double) 5, -30), 3);
		Projectile bullet2 = new Projectile(util.makeArray((double) 5, 30), 3);
		List<Projectile> bullets = new ArrayList<Projectile>();
		bullets.add(bullet0);
		bullets.add(bullet1);
		bullets.add(bullet2);
	}
	public void onSecondaryAttack() {
		
	}
}
