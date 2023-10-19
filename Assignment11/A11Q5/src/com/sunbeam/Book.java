package com.sunbeam;

import java.util.Objects;
import java.util.Scanner;

public class Book implements Comparable<Book> {
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
		return "Book: [isbn=" + isbn + ", price=" + price + ", authorName=" + authorName + ", quantity=" + quantity
				+ "]";
	}

	public void accpet() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the isbn:");
		this.isbn=sc.next();
		System.out.print("Enter the Book author:");
		this.authorName=sc.next();
		System.out.print("Enter the price:");
		this.price=sc.nextDouble();
		System.out.print("Enter the quantity:");
		this.quantity=sc.nextInt();
	}
	public void display() {
		System.out.println("isbn:"+this.isbn);
		System.out.println("Book Author:"+this.authorName);
		System.out.println("Price:"+this.price);
		System.out.println("Quantity:"+this.quantity);
	}
	@Override
	public int compareTo(Book obj) {
		int diff=this.isbn.compareTo(obj.isbn);
		return diff;
	}

}
