package com.kuckian;

import java.util.ArrayList;
import java.util.List;

public final class ListOfVector implements TestInterface<List<Point>> {

	private final List<Point> data;

	@Override
	public final List<Point> getData() {
		return data;
	}

	public ListOfVector(int N) {
		data = new ArrayList<Point>(N);
		for (int n = 0; n < N; n++) {
			data.add(new Point((n % 1 == 0) ? 1 : -1, 1 / (n + 1.0)));
		}
	}

	@Override
	public final double calc(List<Point> xs) {
		double ret = 0;
		for (Point x : xs) {
			ret += x.x * x.y;
		}
		return ret;
	}

}