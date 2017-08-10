package io.github.samirl.pixel.item;

import javax.vecmath.Vector2d;

public final class Projectile {
	public int damage;
	public Vector2d velocity;
	public Projectile(Vector2d velocity, int damage) {
		this.damage = damage;
		this.velocity = velocity;
	}
}
