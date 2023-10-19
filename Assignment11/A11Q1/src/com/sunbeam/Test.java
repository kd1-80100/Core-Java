package com.sunbeam;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test {
	public static void main(String[] args) {
		Set<Book> set = new HashSet<Book>();
		set.add(new Book("a1", 200.0, "VK Mehta", 10));
		set.add(new Book("a2", 450.0, "RS Agrawal", 5));
		set.add(new Book("a3", 360.0, "Khurmi", 12));
		set.add(new Book("a1", 150.0, "Yashavant Kanitkar", 15));	//entry with duplicate isbn
		set.add(new Book("a4", 190.0, "AK Gupta", 7));
		set.add(new Book("a5", 750.0, "RK Bansal", 16));

//	for (Book b : set) {
//		System.out.println(b);
//	}

		Iterator<Book>itr=set.iterator();
		while (itr.hasNext()) {
			Book b = (Book) itr.next();
			System.out.println(b);
		}
	}
}

/*	Here book details with isbn with duplicate value 'a1' is added:
	* duplicate value accepted.
	* Books stored at random order.
	* Duplicate isbn problem can be solved by using equals() and hashcode().(Duplicate values will be eliminated.)
*/