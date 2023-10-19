package com.sunbeam;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

public class Test {
	public static int menu(Scanner sc) {
	int choice;
	System.out.println("1. Add a book in map.");
	System.out.println("2. Find a book in map");
	System.out.println("3. Show isbn-book details:");	//Additional(Not in assignment, for testing purpose only.)
	System.out.print("Enter your choice: ");
	choice=sc.nextInt();
		return choice;
	}
	
public static void main(String[] args) {
	int choice;
	Scanner sc=new Scanner(System.in);
	Map<String, Book> map=new HashMap<>();
	while ((choice = menu(sc)) != 0) {
		switch (choice) {
		case 1:
			Book b=new Book();
			b.accpet();
			map.put(b.getIsbn(), b);
			break;
		case 2:
			System.out.print("Enter the isbn to search book:");
			String  isbn1=sc.next();
			Book b1=map.get(isbn1);
			b1.display();
			break;
		case 3:
			Set<Entry<String, Book>>entries=map.entrySet();
			for (Entry<String, Book> e : entries) {
				System.out.println(e.getKey()+"->"+e.getValue());
			}
			break;
		}
	}
}
}
