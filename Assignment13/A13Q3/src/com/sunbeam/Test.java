package com.sunbeam;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try (FileWriter fw = new FileWriter("File.txt")) {
			try (BufferedWriter br = new BufferedWriter(fw)) {
				for (int i = 1; i <= 4; i++) {
					System.out.println("Enter the String:");
					String s = sc.nextLine();
					br.write(s);
					br.newLine();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
