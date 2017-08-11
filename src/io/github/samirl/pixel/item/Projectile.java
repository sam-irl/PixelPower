package io.github.samirl.pixel.item;

import io.github.samirl.pixel.util.Utilities;

public final class Projectile {
	Utilities util = new Utilities();
	/**
	 * The damage caused, before the velocity bonus
	 */
	private int damage;
	/**
	 * The initial velocity of the projectile
	 */
	private double velocity;
	/**
	 * Direction, in degrees of the unit circle around the player
	 */
	private double direction;
	/**
	 * double acceleration, double direction
	 */
	private double[] vector;
	public Projectile(double[] vector, int damage) {
		this.damage = damage;
		this.vector = vector;
		this.velocity = vector[0];
		this.direction = vector[1];
	}
	public int getDamage() {
		return damage;
	}
	public double getVelocity() {
		return velocity;
	}
	public double getDirection() {
		return direction;
	}
	public double[] getVector() {
		return vector;
	}
}
