package com.kuckian;

public abstract class Main {

	public static <T> void print(String name, TestInterface<T> test, int N) {
		final double res = test.calc(test.getData());
		final double time = Benchmark.run(test);
		System.out.println(String.format("%s: %.2fns/item (result = %.2f)", name, time * (1e9 / N), res));
	}

	public static void main(String[] args) {
		final int N = 1000000;
		print("Array of vectors", new ArrayOfVector(N), N);
		print("List of vectors", new ListOfVector(N), N);
		print("Vectors of arrays", new VectorOfArray(N), N);
	}

}
