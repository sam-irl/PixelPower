package io.github.samirl.pixel.item;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import io.github.samirl.pixel.util.Utilities;

import io.github.samirl.pixel.Attack;
import io.github.samirl.pixel.Player;
import io.github.samirl.pixel.exception.IllegalAttackConstructorException;

public class Shotgun extends Item {
	Utilities util = new Utilities();
	private int id = 0;
	private int dropPercent = 25;
	private String name = "Shotgun";
	private boolean isWeapon = true;
	private Attack primaryAttack;
	private Attack secondaryAttack;
	public Shotgun() {
		try {
			this.primaryAttack = new Attack("Fire Shotgun", 5, false, true, true);
			this.secondaryAttack = new Attack("Bayonet", 3, true, false, false);
		}
		catch(IllegalAttackConstructorException e) {
			this.primaryAttack = null;
			this.secondaryAttack = null;
		}
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
