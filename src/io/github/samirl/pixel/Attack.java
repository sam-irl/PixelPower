package io.github.samirl.pixel;

import io.github.samirl.pixel.exception.InvalidAttackException;

public class Attack {
	private int damage = 0;
	private boolean melee = true;
	private boolean ranged = false;
	private boolean primary = true;
	public Attack(int damage, boolean melee, boolean ranged, boolean primary) throws InvalidAttackException {
		if(melee && ranged) {
			throw new InvalidAttackException("Attack cannot be both melee and ranged");
		}
	}
}
