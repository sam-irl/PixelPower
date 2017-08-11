package io.github.samirl.pixel;

import javax.swing.JFrame;

import io.github.samirl.pixel.item.Item;

public class Inventory {
	private Item item;
	private Player player;
	private Pixel pixel;
	private JFrame frame = pixel.getJFrame();
	public Inventory(Player player) {
		this.player = player;
		if(!player.checkHasItem()) {
			this.item = null;
		} else {
			this.item = player.getItem();
		}
		updateItem(this.item);
	}
	public void updateItem(Item item) {
		if(item == this.item) {
			return;
		}
		this.item = item;
		//frame.doAThing(item.getSprite());
	}
}
