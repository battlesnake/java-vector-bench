package com.kuckian;

import java.util.Calendar;

public abstract class Benchmark {

	private final static int warm_up = 300;
	private final static int trials = 100;

	/* Return seconds per run */
	public static <T> double run(TestInterface<T> test) {
		for (int i = 0; i < warm_up; i++) {
			test.calc(test.getData());
		}
		final long t0 = Calendar.getInstance().getTime().getTime();
		for (int i = 0; i < trials; i++) {
			test.calc(test.getData());
		}
		final long t1 = Calendar.getInstance().getTime().getTime();
		return (t1 - t0) / (trials * 1000.0);
	}

}
