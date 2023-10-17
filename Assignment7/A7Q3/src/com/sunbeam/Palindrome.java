package com.sunbeam;

public class Palindrome {
	public static void main(String[] args) {

		String s1 = "adam";
		String reverseStr = "";

		for (int i = s1.length() - 1; i >= 0; i--) {
			reverseStr = reverseStr + s1.charAt(i);
		}
		if (s1.equals(reverseStr))
			System.out.println("String is palindrome");
		else
			System.out.println("String is not palindrome");
	}
}
