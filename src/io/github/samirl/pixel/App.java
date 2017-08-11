package io.github.samirl.pixel;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class App extends JPanel {
	private Pixel pixel;
	private Arena arena = pixel.getArena();
	private Player pOne = arena.getPlayerOne();
	private Player pTwo = arena.getPlayerTwo();
	private Image one;
	private Image two;
	private Image shotgun;
	private Image healthPack;
	private Image rifle;
	private Image sword;
	private Image nuke;
	public App() {
		init();
	}
	private void init() {
		loadImage(one, "assets/sprites/one.png");
		loadImage(two, "assets/sprites/two.png");
		loadImage(shotgun, "assets/sprites/shotgun.png");
		loadImage(healthPack, "assets/sprites/healthPack.png");
		loadImage(rifle, "assets/sprites/rifle.png");
		loadImage(sword, "assets/sprites/sword.png");
		loadImage(nuke, "assets/sprites/nuke.png");
	}
	@Override
	public void paintComponent(Graphics g) {
		g.drawImage(one, (int) pOne.getX(), (int) pOne.getY(), null);
		g.drawImage(two, (int) pTwo.getX(), (int) pTwo.getY(), null);
	}
	private void loadImage(Image image, String path) {
		ImageIcon icon = new ImageIcon(path);
		image = icon.getImage();
	}
	private void loadImage(Image image, ImageIcon icon) {
		image = icon.getImage();
	}
}
