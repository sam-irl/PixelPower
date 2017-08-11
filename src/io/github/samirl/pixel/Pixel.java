package io.github.samirl.pixel;

import java.awt.EventQueue;
import java.io.File;
import javax.swing.JFrame;

import io.github.samirl.pixel.item.Item;
import io.github.samirl.pixel.util.Utilities;

public class Pixel {
	public Item[] itemList;
	private static Utilities util = new Utilities();
	private final static Arena arena = new Arena(new Player(0, "Player One", false, util.makeArray((double) -25, 0), 20), new Player(0, null, false, util.makeArray((double) 25, 0), 20), util.makeArray(-50, 50), util.makeArray(-50, 50));
	private PixelFrame frame = new PixelFrame();
	public static Arena getArena() {
		return arena;
	}
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				PixelFrame frame = new PixelFrame();
				frame.setVisible(true);
			}
		});
	}
}
