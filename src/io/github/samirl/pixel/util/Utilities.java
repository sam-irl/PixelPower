package io.github.samirl.pixel.util;

public class Utilities {
	public float piFloat = (float) Math.PI;
	public double radiansToDegrees(double radians) {
		return (radians * 180) / Math.PI;
	}
	public float radiansToDegrees(float radians) {
		return (radians * 180) / this.piFloat;
	}
	public double degreesToRadians(double degrees) {
		return (degrees * Math.PI) / 180;
	}
	public float degreesToRadians(float degrees) {
		return (degrees * this.piFloat) / 180;
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
	public Object[] makeArray(Object a, Object b) {
		Object[] array = {a, b};
		return array;
	}
	public double[][] makeNestedArray(double[] a, double[] b) {
		double[][] array = {a, b};
		return array;
	}
	public double[][] makeNestedArray(double a, double b, double c, double d) {
		double[][] array = {{a, b}, {c, d}};
		return array;
	}
	public int[][] makeNestedArray(int[] a, int[] b) {
		int[][] array = {a, b};
		return array;
	}
	public int[][] makeNestedArray(int a, int b, int c, int d) {
		int[][] array = {{a, b}, {c, d}};
		return array;
	}
	public long[][] makeNestedArray(long[] a, long[] b) {
		long[][] array = {a, b};
		return array;
	}
	public long[][] makeNestedArray(long a, long b, long c, long d) {
		long[][] array = {{a, b}, {c, d}};
		return array;
	}
	public Object[][] makeNestedArray(Object[] a, Object[] b) {
		Object[][] array = {a, b};
		return array;
	}
	public Object[][] makeNestedArray(Object a, Object b, Object c, Object d) {
		Object[][] array = {{a, b}, {c, d}};
		return array;
	}
}
