package io.github.samirl.pixel;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class PixelFrame extends JFrame {
	public PixelFrame() {
		initUi();
	}
	private void initUi() {
		add(new App());
		setTitle("PixelPower");
		setSize(300, 200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
