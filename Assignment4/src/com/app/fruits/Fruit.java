package com.app.fruits;

import java.util.Scanner;

public class Fruit {
	private String color;
	private double weight;
	private String name;
	private boolean state;

	public Fruit(String color, double weight, String name, boolean state) {
		this.color = color;
		this.weight = weight;
		this.name = name;
		this.state = state;
	}

	Scanner sc = new Scanner(System.in);

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isState() {
		return state;
	}

	public void setState(boolean state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Fruit [color=" + color + ", weight=" + weight + ", name=" + name + ", fruit state=" + state + "]";
	}

	public String taste() {
		return "no specific taste.";
	}

	public void acceptData() {
//		System.out.print("Enter the fruit:");
//		this.name=sc.next();
		System.out.print("Enter the weight:");
		this.weight = sc.nextDouble();
		System.out.print("Enter the color:");
		this.color = sc.next();
		this.state = true;
	}

	public void displayData() {
		System.out.println("Fruit name:" + this.name);
		System.out.println("Weight:" + this.weight);
		System.out.println("Color:" + this.color);
	}

	public boolean isFresh() {
		if (this.state)
			return true;
		else
			return false;
	}
}
