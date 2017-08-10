package io.github.samirl.pixel;

public class Attack {
	private int damage = 0;
	private boolean melee = true;
	private boolean ranged = false;
	private boolean primary = true;
	/**
	 * Defines an instance of a weapon's attack.
	 * 
	 * @param name
	 * @param damage
	 * @param melee
	 * @param ranged
	 * @param primary
	 */
	public Attack(String name, int damage, boolean melee, boolean ranged, boolean primary) {
		if(melee && ranged) {
			return;
		}
	}
}
