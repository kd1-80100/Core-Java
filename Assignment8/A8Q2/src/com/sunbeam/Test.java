package com.sunbeam;

import java.util.Scanner;

class Box<T> {
	private T obj;

	public Box() {
		this.obj = null;
	}

	public Box(T obj) {
		this.obj = obj;

	}

	public void set(T val) {
		this.obj = val;
	}

	public T get() {
		return obj;
	}

}

public class Test {

	public static void printDisplayableBox(Box<? extends Displayable> b) {
		b.get().DisplayData();
	}

	public static void printAnyBox(Box<?> b) {
		System.out.println(b.get().toString());
	}

	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);

		Box<Person> p1 = new Box<>();
		p1.set(new Person("Pavan", "Patil"));
		printDisplayableBox(p1);

		printAnyBox(p1);

		Box<Person> p2 = new Box<>();
		Person s = new Person();
		s.accept(ss);
		p2.set(s);
		printDisplayableBox(p2);

		printAnyBox(p2);

		Box<Date> d1 = new Box<>();
		d1.set(new Date(16, 12, 1995));
		printDisplayableBox(d1);

		printAnyBox(d1);

		Box<Date> d2 = new Box<>();
		Date dd = new Date();
		dd.acceptData();
		d2.set(dd);
		printDisplayableBox(d2);

		printAnyBox(d2);

		Box<String> str = new Box<>();
		str.set("Helloo");
		// printDisplayableBox(str); error as String is not extended from displayable
		// interface

		printAnyBox(str);

	}

}
