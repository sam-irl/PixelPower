package io.github.samirl.pixel.item;

public class Weapon extends Item {
	private int damage;
	private double range;
	public Weapon(int damage, double range) {
		this.damage = damage;
		this.range = range;
	}
}
