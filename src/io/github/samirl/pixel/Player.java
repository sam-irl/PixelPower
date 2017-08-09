package io.github.samirl.pixel;

import java.io.File;

import io.github.samirl.pixel.item.Item;

public class Player {
	private File avatar = new File("missing-ava.png");
	private int id = -1;
	private String displayName = "error";
	private boolean hasItem = false;
	public Player(File avatar, int id, String displayName, boolean hasItem) {
		this.avatar = avatar;
		this.id = id;
		this.displayName = displayName;
		this.hasItem = hasItem;
	}
	public void usePrimary() {
		if(!hasItem) {
			return;
		}
	}

}
