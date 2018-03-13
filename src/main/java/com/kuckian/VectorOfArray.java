package com.kuckian;

public final class VectorOfArray implements TestInterface<DataPointsArray> {

	private final DataPointsArray data;

	@Override
	public final DataPointsArray getData() {
		return data;
	}

	public VectorOfArray(int N) {
		data = new DataPointsArray(N);
		for (int n = 0; n < N; n++) {
			data.x[n] = (n % 1 == 0) ? 1 : -1;
			data.y[n] = 1 / (n + 1.0);
		}
	}

	@Override
	public double calc(DataPointsArray xs) {
		int N = xs.x.length;
		double ret = 0;
		for (int n = 0; n < N; n++) {
			ret += xs.x[n] * xs.y[n];
		}
		return ret;
	}

}