/*
Create a class called Date that includes three fields—a month (type int), a day (type int) and a
year (type int). Provide a constructor that initializes the three instance variables and assumes that
the values provided are correct. Provide a set and a get method for each instance
variable. Provide a method displayDate that displays the month, day and year separated by forward
slashes (/). Write a test application named DateTest that demonstrates class Date’s capabilities.
 */
import java.util.Scanner;
public class Date {
	int day;
	int month;
	int year;

	public Date(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public Date() {
		this.day = 23;
		this.month = 02;
		this.year = 2002;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void acceptDate() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the day:");
		day = sc.nextInt();
		System.out.print("Enter the month:");
		month = sc.nextInt();
		System.out.print("Enter the year:");
		year = sc.nextInt();
		sc.close();
	}

	public void displayDate() {
		System.out.println("Date:" + this.day + "/" + this.month + "/" + this.year);
	}
}
