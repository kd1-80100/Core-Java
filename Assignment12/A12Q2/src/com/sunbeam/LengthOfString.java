package com.sunbeam;

import java.util.function.Predicate;

public class LengthOfString {
	public static int countIf(String[] arr, Predicate<String> cond) {
		int count = 0;
		for (String str : arr) {
			if (cond.test(str))
				count++;
		}
		return count;
	}

	public static void main(String[] args) {
		String[] arr = { "Nilesh", "Shubham", "Pratik", "Omkar", "Prashant" };
		int cnt = countIf(arr, s1 -> s1.length() > 6);
		System.out.println("Number of Strings having length > 6 = " + cnt);
	}
}
