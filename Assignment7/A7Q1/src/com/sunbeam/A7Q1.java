package com.sunbeam;

public class A7Q1 {
	public static void main(String[] args) {

		String str = "abcd";
		String str2 = "abcd";
		String str3 = "ab";

		if (str.equals(str2))
			System.out.println("Strings " + str + " and " + str2 + " are Equal");
		else
			System.out.println("Strings " + str + " and " + str2 + " are not Equal");

		if (str.equals(str3))
			System.out.println("Strings " + str + " and " + str3 + " are Equal");
		else
			System.out.println("Strings " + str + " and " + str3 + " are not Equal");

	}

}
