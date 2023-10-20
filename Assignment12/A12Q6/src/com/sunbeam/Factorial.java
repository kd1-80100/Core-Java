package com.sunbeam;

import java.util.Scanner;
import java.util.stream.Stream;

public class Factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number to calculate factorial:");
		int a=sc.nextInt();
		Stream<Integer> str = Stream.iterate(1, x -> x + 1).limit(a);
		int res = str.reduce(1, (x, y) -> x * y);
		System.out.println(a+" factorial is: "+res);
		sc.close();
	}
}
