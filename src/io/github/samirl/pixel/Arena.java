package io.github.samirl.pixel;

import javax.swing.JFrame;

import io.github.samirl.pixel.exception.InvalidLocationException;
import io.github.samirl.pixel.item.HealthPack;
import io.github.samirl.pixel.item.Item;
import io.github.samirl.pixel.item.Shotgun;

public class Arena {
	private int[] xLimit;
	private int[] yLimit;
	private Player one;
	private Player two;
	Pixel pixel = new Pixel();
	JFrame frame = pixel.getJFrame();
	public Arena(Player one, Player two, int[] xLimit, int[] yLimit) {
		double[] oneLocation = {-50, 0};
		double[] twoLocation = {50, 0};
		try {
			one.setLocation(oneLocation);
			two.setLocation(twoLocation);
		} catch (InvalidLocationException e) {
			e.printStackTrace();
		}
		this.one = one;
		this.two = two;
	}
	public int[] getxLimit() {
		return xLimit;
	}
	public int getNegativeXLimit() {
		return xLimit[0];
	}
	public int getPositiveXLimit() {
		return xLimit[1];
	}
	public void setxLimit(int[] xLimit) {
		this.xLimit = xLimit;
	}
	public void setNegativeXLimit(int x) {
		this.xLimit[0] = x;
	}
	public void setPositiveXLimit(int x) {
		this.xLimit[1] = x;
	}
	public int[] getyLimit() {
		return yLimit;
	}
	public int getBottomYLimit() {
		return yLimit[0];
	}
	public int getTopYLimit() {
		return yLimit[1];
	}
	public void setyLimit(int[] yLimit) {
		this.yLimit = yLimit;
	}
	public void setBottomYLimit(int y) {
		this.yLimit[0] = y;
	}
	public void setTopYLimit(int y) {
		this.yLimit[1] = y;
	}
	public Player getPlayerOne() {
		return this.one;
	}
	public Player getPlayerTwo() {
		return this.two;
	}
	public void spawnItem() {
		double random = Math.random();
		double locationRand = Math.random();
		double location = (locationRand - 0.5) * 100;
		Item newItem = null;
		if(random < 0.2) {
			newItem = new Shotgun();
		}
		if(random >= 0.2 && random < 0.4) {
			newItem = new HealthPack();
		}
		if(random >= 0.4 && random < 0.6) {
			newItem = new Item();
		}
		if(random >= 0.6 && random < 0.8) {
			newItem = new Item();
		}
		if(random >= 0.8) {
			newItem = new Item();
		}
		pixel.itemList[pixel.itemList.length + 1] = newItem;
	}
}
