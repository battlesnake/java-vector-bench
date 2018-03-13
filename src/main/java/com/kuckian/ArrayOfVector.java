package com.kuckian;

public final class ArrayOfVector implements TestInterface<Point[]> {

	private final Point[] data;

	@Override
	public final Point[] getData() {
		return data;
	}

	public ArrayOfVector(int N) {
		data = new Point[N];
		for (int n = 0; n < N; n++) {
			data[n] = new Point((n % 1 == 0) ? 1 : -1, 1 / (n + 1.0));
		}
	}

	@Override
	public final double calc(Point[] xs) {
		double ret = 0;
		for (Point x : xs) {
			ret += x.x * x.y;
		}
		return ret;
	}

}