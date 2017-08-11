package io.github.samirl.pixel;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

import io.github.samirl.pixel.exception.InvalidLocationException;

public class Input implements KeyListener {
	private static Pixel pixel;
	private static Arena arena = pixel.getArena();
	private static Player one = arena.getPlayerOne();
	private static Player two = arena.getPlayerTwo();
	private PixelPanel panel = pixel.getPanel();

	/**
	 * This method should be run once at startup, to initialize the inputs.
	 * 
	 * @param frame
	 */
	public static void setupInputListener(JFrame frame) {
		frame.addKeyListener(null);
	}
	@Override
	public void keyPressed(KeyEvent e) {
		switch (e.getKeyChar()) {
		case 'd':
			try {
				one.setLocation(one.getX() + 1, one.getY());
			} catch (InvalidLocationException ex) {
				return;
			}
		case 'a':
			try {
				one.setLocation(one.getX() - 1, one.getY());
			} catch (InvalidLocationException ex) {
				return;
			}
			
		case 'w':
			one.pickupOrDropItem();
			
		case 'q':
			one.usePrimary();
			
		case 'e':
			one.useSecondary();
			
		case 'j':
			try {
				two.setLocation(two.getX() - 1, two.getY());
			} catch (InvalidLocationException ex) {
				return;
			}
			
		case 'l':
			try {
				two.setLocation(two.getX() + 1, two.getY());
			} catch (InvalidLocationException ex) {
				return;
			}
			
		case 'k':
			two.pickupOrDropItem();
			
		case 'u':
			two.usePrimary();
			
		case 'o':
			two.useSecondary();
			
		default:
			panel.redraw();
		}
	}
	@Override
	public void keyReleased(KeyEvent arg0) {
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		
	}
}
