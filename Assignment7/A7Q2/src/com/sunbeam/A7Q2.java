package com.sunbeam;

public class A7Q2 {
	public static void main(String[] args) {
		String a = "PavanPatil";
		char[] b = a.toCharArray();
		for (int i = a.length() - 1; i >= 0; i--) {
			System.out.print(b[i]);
		}
	}
}
