package io.github.samirl.pixel;

import javax.swing.JFrame;

import io.github.samirl.pixel.exception.InvalidLocationException;

public class Arena {
	private int[] xLimit;
	private int[] yLimit;
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
}
