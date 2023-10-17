package com.sunbeam;

import java.util.Scanner;

public class Book {
	private String isbn;
	private double price;
	private String authorName;
	private int quantity;

	Scanner sc = new Scanner(System.in);

	public Book() {
	}

	public Book(String isbn, double price, String authorName, int quantity) {
		this.isbn = isbn;
		this.price = price;
		this.authorName = authorName;
		this.quantity = quantity;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", price=" + price + ", authorName=" + authorName + ", quantity=" + quantity
				+ "]";
	}

	public void acceptData() {
		System.out.print("Enter the isbn number:");
		this.isbn=sc.next();
		System.out.print("Enter the Book auther:");
		this.authorName=sc.next();
		System.out.print("Enter the price:");
		this.price=sc.nextDouble();
		System.out.print("Enter the quantity:");
		this.quantity=sc.nextInt();
	}
	public void displayData() {
		System.out.println("isbn:"+this.isbn);
		System.out.println("Book Auther:"+this.authorName);
		System.out.println("Price:"+this.price);
		System.out.println("Quantity:"+this.quantity);
	}
}

/*
 * Store book details in a library in a list -- ArrayList. Book details:
 * isbn(string), price(double), authorName(string), quantity(int) Write a menu
 * driven (do-while + switch-case) program to 1. Add new book in list. 2.
 * Display all books in forward order. 3. Delete at book given index --
 * list.remove(index); 4. Check if book with given isbn is in list or not 5.
 * Delete all books in list 6. Display number of books in list 7. Sort all books
 * by price in desc order -- list.sort();
 */
