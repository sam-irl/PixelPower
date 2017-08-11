package io.github.samirl.pixel.event;

import io.github.samirl.pixel.Player;
import io.github.samirl.pixel.exception.InvalidLocationException;
import io.github.samirl.pixel.item.Item;
import io.github.samirl.pixel.item.Projectile;

public class Event {
	public void onRangedCollide(Projectile fired, Player hit) {
		if(fired.getVelocity() < 0.25) {
			return;
		}
		hit.setHealthPoints((int) (hit.getHealthPoints() - ((fired.getDamage()) + Math.sqrt(fired.getVelocity()))));
	}
	public void onMeleeCollide(Item weapon, Player player) {
		
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
