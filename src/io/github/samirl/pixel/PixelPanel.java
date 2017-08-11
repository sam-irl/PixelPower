package io.github.samirl.pixel;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class PixelPanel extends JPanel {
	private JFrame frame;
	public PixelPanel(JFrame frame) {
		this.frame = frame;
		this.addKeyListener(new Input());
	}
	public void redraw() {
		
	}
}
