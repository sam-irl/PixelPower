package io.github.samirl.pixel.util;

import javax.vecmath.Vector2d;

public class Utilities {
	public Vector2d vectorFromDegrees(double x, double y) {
		if(x > 360) {
			x = x - 360;
		}
		if(x < 0) {
			x = x + 360;
		}
		if(y > 360) {
			y = y - 360;
		}
		if(y < 360) {
			y = y + 360;
		}
		return new Vector2d(((x + Math.PI) / 180), ((y + Math.PI) / 180));
	}
}
