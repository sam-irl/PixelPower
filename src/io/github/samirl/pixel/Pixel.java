package io.github.samirl.pixel;

import javax.swing.JFrame;

import io.github.samirl.pixel.util.Utilities;

public class Pixel {
	private static JFrame frame = new JFrame();
	private static Utilities util = new Utilities();
	public static JFrame getJFrame() {
		return frame;
	}
	private static final double[] nullLoc = {0, 0};
	public static Arena arena = new Arena(new Player(null, 0, "Player One", false, nullLoc, 20), new Player(null, 0, null, false, nullLoc, 20), util.makeArray(-50, 50), util.makeArray(-50, 50));
	public static FrameInteractionHandler handler = new FrameInteractionHandler(getJFrame());
	public static void main(String[] args) {
		
	}

}
