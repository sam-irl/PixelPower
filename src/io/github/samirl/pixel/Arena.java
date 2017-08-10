package io.github.samirl.pixel;

import javax.swing.JFrame;

public class Arena {
	Pixel pixel = new Pixel();
	JFrame frame = pixel.getJFrame();
	public Arena(Player one, Player two) {
		double[] oneLocation = {-50, 0};
		double[] twoLocation = {50, 0};
		one.setLocation(oneLocation);
		two.setLocation(twoLocation);
	}
}
