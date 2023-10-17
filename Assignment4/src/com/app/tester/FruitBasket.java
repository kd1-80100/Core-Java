package com.app.tester;

import java.util.Scanner;

import com.app.fruits.Apple;
import com.app.fruits.Fruit;
import com.app.fruits.Mango;
import com.app.fruits.Orange;

public class FruitBasket {
	public static Scanner sc = new Scanner(System.in);

	public static int menu() {
		int choice;
		System.out.println("***********************************************************************************");
		System.out.println("** Menu **");
		System.out.println("0. Exit");
		System.out.println("1. Add Mango");
		System.out.println("2. Add Orange");
		System.out.println("3. Add Apple");
		System.out.println("4. Display names of all fruits in the basket:");
		System.out.println("5. Display name,color,weight,taste of all fresh fruits in the basket:");
		System.out.println("6. Display tastes of all stale(not fresh) fruits in the basket:");
		System.out.println("7.Mark a fruit as stale");
		System.out.println("8.Mark all sour fruits stale");
		System.out.print("Enter the choice:");
		choice = sc.nextInt();
		System.out.println("***********************************************************************************");
		return choice;
	}

	public static void main(String[] args) {
		int choice;
		int basketSize=0;
		int counter=0;
		int index;
		System.out.println("Please enter the size of basket");
		basketSize = sc.nextInt();
		Fruit[] basket = new Fruit[basketSize];
		do {
			choice = menu();
			switch (choice) {
			case 0:
				System.out.println("THANKS FOR USING OUR APPLICATION.....:)");
				break;
			case 1:
				if (counter < basketSize) {
					basket[counter] = new Mango();
					basket[counter].acceptData();
					counter++;
				} else
					System.out.println("Basket is full!!!");
				break;
			case 2:
				if (counter < basketSize) {
					basket[counter] = new Orange();
					basket[counter].acceptData();
					counter++;
				} else
					System.out.println("Basket is full!!!");

				break;
			case 3:
				if (counter < basketSize) {
					basket[counter] = new Apple();
					basket[counter].acceptData();
					counter++;
				}
				break;
			case 4:
				for (Fruit arr : basket) {
					if (arr != null) {
						System.out.println("Name of fruit : " + arr.getName());

					}
				}
				break;
			case 5:
				for (Fruit arr : basket) {
					if (arr != null) {
						arr.toString();
						arr.taste();
						if (arr.isFresh())
							System.out.println(arr.getName() + " is Fresh");
						else
							System.out.println(arr.getName() + " is Stale");
					}
				}
				break;
				case 6:
				for (Fruit arr : basket) {
					if (arr != null) {
						if (!arr.isFresh())
							System.out.println(arr.taste());
					}
				}
				break;
				
			case 7: {
				System.out.println("Enter the Index ");
				index = sc.nextInt();
				if (index >= 0 && index < basketSize) {
					basket[index].setState(false);
				}
			}
				break;
				
			case 8:
				for (Fruit arr : basket) {
					if (arr != null) {
						if (arr.taste() == "sour taste")
							arr.setState(false);
					}
				}
				break;
			default:
				System.out.println("Wrong choice entered..");
				break;
			}
		}while(choice!=0);
	}
}
