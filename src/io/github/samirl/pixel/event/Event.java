package io.github.samirl.pixel.event;

import io.github.samirl.pixel.Player;
import io.github.samirl.pixel.exception.InvalidLocationException;
import io.github.samirl.pixel.item.Projectile;
import io.github.samirl.pixel.item.Weapon;

public class Event {
	public void onRangedCollide(Projectile fired, Player hit) {
		if(fired.velocity.lengthSquared() < 0.25) {
			return;
		}
		hit.setHealthPoints((int) (hit.getHealthPoints() - ((fired.damage) + Math.sqrt(fired.velocity.lengthSquared()))));
	}
	public void onMeleeCollide(Weapon weapon, Player player) {
		
	}
	public void onPlayerCollide(Player one, Player two) {
		double[] oneLocation = one.getLocation();
		double[] twoLocation = two.getLocation();
		if(oneLocation[0] < twoLocation[0]) {
			try {
				one.setLocation(oneLocation[0] - 5, oneLocation[1]);
			} catch(InvalidLocationException e) {
				e.printStackTrace();
			}

		}
	}
}
