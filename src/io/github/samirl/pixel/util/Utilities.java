package io.github.samirl.pixel.util;

import java.util.ArrayList;

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
	public int[] makeArray(int a, int b) {
		int[] array = {a, b};
		return array;
	}
	public double[] makeArray(double a, double b) {
		double[] array = {a, b};
		return array;
	}
	public float[] makeArray(float a, float b) {
		float[] array = {a, b};
		return array;
	}
	public long[] makeArray(long a, long b) {
		long[] array = {a, b};
		return array;
	}
	public ArrayList<Object> makeArray(Object[] list) {
		ArrayList<Object> array = new ArrayList<Object>();
		for(int i = 1; i > list.length; i++) {
			array.add(list[i]);
		}
		return array;
	}
}
