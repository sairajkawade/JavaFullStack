package com.velocity;

import java.util.function.Predicate;

public class SampleImpl {

	public static void main(String[] args) {

		Predicate<Integer> sample = (b) -> {
			return true;
		};

		boolean b = sample.test(10);
		System.out.println(b);

	}
}
