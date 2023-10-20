package com.sunbeam;

import java.util.Random;
import java.util.stream.Stream;

public class SumOfRandomNum {
	public static void main(String[] args) {
		Random r = new Random();
		Stream<Integer> str = Stream.generate(()->r.nextInt(10)).limit(10);
		int sum = str.reduce(0, (a, e) -> a + e);
		System.out.println("Sum of first 10 natural numbers: " + sum);
	}
}
