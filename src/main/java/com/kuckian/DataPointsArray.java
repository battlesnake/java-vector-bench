package com.kuckian;

public final class DataPointsArray {
	public final double[] x;
	public final double[] y;

	public DataPointsArray(int N) {
		this.x = new double[N];
		this.y = new double[N];
	}
}