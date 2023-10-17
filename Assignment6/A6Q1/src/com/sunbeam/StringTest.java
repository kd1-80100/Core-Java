package com.sunbeam;
import java.util.Scanner;

public class StringTest {
	public static void main(String[] args) {
		StringClass stringClass=new StringClass();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the input string:");
		String s=sc.next();
		try {
			stringClass.setS(s);
			System.out.println(stringClass);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
