package io.github.samirl.pixel;

import java.io.File;
import javax.swing.JFrame;

import io.github.samirl.pixel.item.Item;
import io.github.samirl.pixel.util.Utilities;

public class Pixel {
	public Item[] itemList;
	private static JFrame frame = new JFrame();
	private static Utilities util = new Utilities();
	public static JFrame getJFrame() {
		return frame;
	}
	private final static Arena arena = new Arena(new Player(new File("../../../../../assets/sprites/playerone.png"), 0, "Player One", false, util.makeArray((double) -25, 0), 20), new Player(new File("../../../../../assets/avatars/playertwo.png"), 0, null, false, util.makeArray((double) 25, 0), 20), util.makeArray(-50, 50), util.makeArray(-50, 50));
	private static PixelPanel panel = new PixelPanel(getJFrame());
	public static Arena getArena() {
		return arena;
	}
	public static void main(String[] args) {
		if(args[0].equalsIgnoreCase("cc")) {
			new CheatConsole().run();
		}
	}
	public static PixelPanel getPanel() {
		return panel;
	}

}
