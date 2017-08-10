package io.github.samirl.pixel;

import javax.swing.JFrame;

public class Pixel {
	private static JFrame frame = new JFrame();
	public JFrame getJFrame() {
		return this.frame;
	}
	private static final double[] nullLoc = {0, 0};
	public static Arena arena = new Arena(new Player(null, 0, "Player One", false, nullLoc), new Player(null, 0, null, false, nullLoc));
	public static void main(String[] args) {
		
	}

}
