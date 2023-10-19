package com.sunbeam;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class Test {
	public static void main(String[] args) {
		class BookPriceComparator implements Comparator<Book> {
			@Override
			public int compare(Book b1, Book b2) {
				int diff = -Double.compare(b1.getPrice(), b2.getPrice());
//				int diff=b1.getIsbn().compareTo(b2.getIsbn());
				return diff;
			}
		}
		BookPriceComparator pcmp = new BookPriceComparator();

		TreeSet<Book> set = new TreeSet<Book>(pcmp);
		set.add(new Book("a1", 450.0, "RS Agrawal", 5));
		set.add(new Book("a2", 200.0, "VK Mehta", 10));
		set.add(new Book("a3", 190.0, "AK Gupta", 7));
		set.add(new Book("a1", 360.0, "Khurmi", 12));
		set.add(new Book("a5", 150.0, "Yashavant Kanitkar", 15)); 
		set.add(new Book("a4", 750.0, "RK Bansal", 16));

		Iterator<Book> itr = set.iterator();
		while (itr.hasNext()) {
			Book b = (Book) itr.next();
			System.out.println(b);
		}
		System.out.println("*********************************");
		Iterator<Book> itr1 = set.descendingIterator();
		while (itr1.hasNext()) {
			Book b1 = (Book) itr1.next();
			System.out.println(b1);
		}
	}
}