package io.github.samirl.pixel;

import java.io.File;

import io.github.samirl.pixel.exception.InvalidLocationException;
import io.github.samirl.pixel.item.Item;

public class Player {
	private File avatar = new File("missing-ava.png");
	private int id = -1;
	private String displayName = "error";
	private boolean hasItem = false;
	private double[] location = {0, 0};
	private int healthPoints = 0;
	private boolean isDead = false;
	private Item item;
	/**
	 * Instance of a player.
	 * 
	 * @param avatar
	 * @param id
	 * @param displayName
	 * @param hasItem
	 * @param location
	 * @param healthPoints
	 * @param isDead
	 */
	public Player(File avatar, int id, String displayName, boolean hasItem, double[] location, int healthPoints) {
		this.avatar = avatar;
		this.id = id;
		this.displayName = displayName;
		this.hasItem = hasItem;
		this.location = location;
		this.healthPoints = healthPoints;
		this.item = item;
		if(healthPoints <= 0) {
			this.isDead = true;
		} else {
			this.isDead = false;
		}
	}
	public int getHealthPoints() {
		return healthPoints;
	}
	public void setHealthPoints(int healthPoints) {
		this.healthPoints = healthPoints;
	}
	public boolean isDead() {
		return isDead;
	}
	public void setDead(boolean isDead) {
		this.isDead = isDead;
	}
	public void usePrimary() {
		if(!hasItem) {
			return;
		}
	}
	public File getAvatar() {
		return avatar;
	}
	public double[] getLocation() {
		return location;
	}
	public double getX() {
		return location[0];
	}
	public double getY() {
		return location[1];
	}
	public int getId() {
		return id;
	}
	public Integer getIdAsInteger() {
		return Integer.valueOf(id);
	}
	public String getDisplayName() {
		return displayName;
	}
	public boolean checkHasItem() {
		return hasItem;
	}
	public void setAvatar(File avatar) {
		this.avatar = avatar;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
	public void setLocation(double[] location) throws InvalidLocationException {
		if(location[0] > 50 || location[0] < -50 || location[1] > 50 || location[1] < -50) {
			throw new InvalidLocationException("The requested coordinates are invalid for this arena!");
		} else {
			this.location = location;
		}
	}
	public void setLocation(double x, double y) throws InvalidLocationException {
		if(x > 50 || x < -50 || y > 50 || y < -50) {
			throw new InvalidLocationException("The requested coordinates are invalid for this location!");
		} else {
			double[] newLocation = {x, y};
			this.location = newLocation;
		}
	}
	public Item getItem() {
		return item;
	}
	/**
	 * Set's the player's item.
	 * Give {@code null} to clear.
	 * A Player may only have one item at a time.
	 * 
	 * @param item
	 */
	public void setItem(Item item) {
		if(item == null) {
			this.hasItem = false;
		} else {
			this.hasItem = true;
		}
		this.item = item;
	}
}
