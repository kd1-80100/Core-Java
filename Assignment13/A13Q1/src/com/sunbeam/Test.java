package com.sunbeam;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class CompareBooks implements Comparator<Book> {

	@Override
	public int compare(Book b1, Book b2) {
		int diff = Double.compare(b1.getPrice(), b2.getPrice());
		return diff;
	}
}

public class Test {
	public static int menu(Scanner sc) {
		int choice = 0;
		System.out.println("1. Add new book in List.");
		System.out.println("2. Display all books in forward order using random access.");
		System.out.println("3. Search a book with given isbn");
		System.out.println("4. Delete a book at given index.");
		System.out.println("5. Delete a book with given isbn.");
		System.out.println("6. Reverse the list");
		System.out.println("7. Save books in a file");
		System.out.println("8. Load books from a file");
		System.out.println("Enter the choice:");
		choice = sc.nextInt();
		return choice;
	}

	public static void main(String[] args) {
		int choice;
		int index = 0;
		Scanner sc = new Scanner(System.in);
		List<Book> list = new ArrayList<Book>();
		while ((choice = menu(sc)) != 0) {
			switch (choice) {
			case 1:
				Book b1 = new Book();
				b1.acceptData();
				if (list.contains(b1)) {
					System.out.println("************");
					System.out.println("Book is present in list.");
					int index1 = list.indexOf(b1);
					System.out.println("Enter the quantity");
					int q = sc.nextInt();
					b1.setQuantity(b1.getQuantity() + q);
					System.out.println("Book quantity updated.");
				} else {
					list.add(b1);
					System.out.println("Book added in the list.");
				}

				break;
			case 2:
				for (int i = 0; i < list.size(); i++) {
					b1 = list.get(i);
					System.out.println(b1);
				}
				break;
			case 3:
				System.out.println("Enter isbn to search a book:");
				String str = sc.next();
				Book key = new Book();
				key.setIsbn(str);
				if (list.contains(key)) {
					index = list.indexOf(key);
					b1 = list.get(index);
					System.out.println(b1);
				}
				break;
			case 4:
				System.out.println("Enter the index to delete :");
				int in = sc.nextInt();
				if (in >= 0 && in < list.size()) {
					b1 = list.get(in);
					list.remove(in);
					System.out.println("BOOK REMOVED : " + b1);
				} else
					System.out.println("Wrong index");
				break;
			case 5:
				System.out.println("enter the book id to remove:");
				String s = sc.next();
				Book key1 = new Book();
				key1.setIsbn(s);
				if (list.contains(key1))
					index = list.indexOf(key1);
				list.remove(index);
				break;
			case 6:
				Collections.reverse(list);
				System.out.println("Reverse List " + list);
				break;
			case 7:
				try (FileOutputStream fout = new FileOutputStream("Book.txt")) {
					try (DataOutputStream dout = new DataOutputStream(fout)) {
						for (Book b : list) {
							dout.writeUTF(b.getIsbn());
							dout.writeDouble(b.getPrice());
							dout.writeUTF(b.getAuthorName());
							dout.writeInt(b.getQuantity());
						}
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
				System.out.println("Books saved in a file.");
				break;
			case 8:
				try (FileInputStream fin = new FileInputStream("Book.txt")) {
					try (DataInputStream din = new DataInputStream(fin)) {
						while (true) {
							Book book = new Book();
							book.setIsbn(din.readUTF());
							book.setPrice(din.readDouble());
							book.setAuthorName(din.readUTF());
							book.setQuantity(din.readInt());
						}
					}
				}catch (EOFException e) {
//					e.printStackTrace();
				}
				catch (Exception e) {
					e.printStackTrace();
				}
				System.out.println("Books loaded from a file.");
				break;
			default:
				break;
			}
		}
	}
}