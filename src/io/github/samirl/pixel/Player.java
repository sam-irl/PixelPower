package io.github.samirl.pixel;

import java.io.File;

import io.github.samirl.pixel.item.Item;

public class Player {
	private File avatar = new File("missing-ava.png");
	private int id = -1;
	private String displayName = "error";
	private boolean hasItem = false;
	private double[] location = {0, 0};
	/**
	 * Instance of a player.
	 * 
	 * @param avatar
	 * @param id
	 * @param displayName
	 * @param hasItem
	 * @param location
	 */
	public Player(File avatar, int id, String displayName, boolean hasItem, double[] location) {
		this.avatar = avatar;
		this.id = id;
		this.displayName = displayName;
		this.hasItem = hasItem;
		this.location = location;
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
	public void setHasItem(boolean hasItem) {
		this.hasItem = hasItem;
	}
	public void setLocation(double[] location) {
		this.location = location;
	}
}
