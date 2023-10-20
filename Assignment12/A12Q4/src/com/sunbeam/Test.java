package com.sunbeam;

import java.util.Arrays;

public class Test {
	static <T> int countIf(T[] arr, T key, Check<T> c) {
		int count = 0;
		for (T t : arr)
			if (c.compare(t, key))
				count++;
		return count;
	}

	public static void main(String[] args) {
		Integer[] arr = { 44, 77, 99, 22, 55, 66 };
		Integer key = 50;
		int cnt = countIf(arr, key, (x, y) -> x > y);
		System.out.println("Count = " + cnt);
	}
}
