package com.sunbeam;

import java.util.Arrays;
import java.util.Comparator;

public class Test {

	public static void main(String[] args) {
		Student s[] = new Student[5];
		s[0] = new Student(1, "Pavan", "Pune", 88.18);
		s[1] = new Student(2, "Akhilesh", "Kolhapur", 90.83);
		s[2] = new Student(3, "Akash", "Kolhapur", 86.11);
		s[3] = new Student(4, "Suyash", "Pune", 89.00);
		s[4] = new Student(5, "Prasanna", "Islampur", 90.83);

		StudentComparator sc = new StudentComparator();
		Arrays.sort(s, sc);
		System.out.println("After sorting by Student city,marks and name:");
		for (Student std : s) {
			System.out.println(std);
		}
	}

}
