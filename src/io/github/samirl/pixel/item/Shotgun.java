package io.github.samirl.pixel.item;

import java.util.ArrayList;
import java.util.List;

import io.github.samirl.pixel.util.Utilities;

import io.github.samirl.pixel.Attack;
import io.github.samirl.pixel.Player;

public class Shotgun extends Item {
	Utilities util = new Utilities();
	public int id = 0;
	public int dropPercent = 25;
	public String name = "Shotgun";
	public boolean isWeapon = true;
	public Attack primaryAttack = new Attack("Fire Shotgun", 5, false, true, true);
	public Attack secondaryAttack = new Attack("Bayonet", 3, true, false, false);
	public void onPrimaryAttack(Player target) {
		Projectile bullet0 = new Projectile(util.vectorFromDegrees(target.getLocation()[0] + 5, target.getLocation()[1] + 30), 3);
		Projectile bullet1 = new Projectile(util.vectorFromDegrees(target.getLocation()[0] + 5, target.getLocation()[1] + 0), 3);
		Projectile bullet2 = new Projectile(util.vectorFromDegrees(target.getLocation()[0] + 5, target.getLocation()[1] + -30), 3);
		List<Projectile> bullets = new ArrayList<Projectile>();
		bullets.add(bullet0);
		bullets.add(bullet1);
		bullets.add(bullet2);
	}
	public void onSecondaryAttack() {
		
	}
}
