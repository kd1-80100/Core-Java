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
		Double[] arr = { 1.2, 2.3, 3.4, 2.3, 4.5, 1.2, 5.6 };
		Double key = 2.3;
		int cnt=countIf(arr, key, (e,k)->e.equals(k));
		System.out.println("Count = " + cnt);
	}
}