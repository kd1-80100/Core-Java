package com.sunbeam;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		int choice;
		List<User> list= new ArrayList<User>();
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("1.Insert user into table.");
			System.out.println("2.Delete user from table.");
			System.out.println("3.Update user.");
			System.out.println("4.Display all users.");
			System.out.println("5.Display users with custom id.");
			System.out.println("6.Change voting status.");
			System.out.println("Press 0 to Exit.");
			System.out.print("Enter your choice:");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				try(UserDao udao=new UserDao()){
					System.out.println("Enter the first name:");
					String fName=sc.next();
					System.out.println("Enter the last name:");
					String lName=sc.next();
					System.out.println("Enter the email:");
					String email=sc.next();
					System.out.println("Enter the password:");
					String password=sc.next();
					System.out.println("Enter the date:");
					String date=sc.next();
					int c=udao.insertUser(fName, lName, email, password, date);
					System.out.println("User inserted. "+c+" rows affected.");
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;
			case 2:
				try(UserDao udao=new UserDao()){
					System.out.println("Enter the id:");
					int id=sc.nextInt();
					int c=udao.deleteUser(id);
					System.out.println("User deleted. "+c+" rows affected.");
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;
			case 3:
				try(UserDao udao=new UserDao()){
					System.out.println("Enter the id for which details to be modified:");
					int id=sc.nextInt();
					System.out.println("Enter the first name:");
					String first_name=sc.next();
					System.out.println("Enter the last name:");
					String last_name=sc.next();
					System.out.println("Enter the email:");
					String email=sc.next();
					int c=udao.updateUser(id, first_name, last_name, email);
					System.out.println("Row updated.");
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;
			case 4:
				try(UserDao udao=new UserDao()){
					List<User>list1=new ArrayList<>();
					list1=udao.displayAllUser();
					list1.forEach(c->System.out.println(c));
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				break;
			case 5:
				try(UserDao udao=new UserDao()){
					System.out.println("Enter the id to be displayed:");
					int id= sc.nextInt();
					list=udao.customDisplay(id);
					list.forEach(x->System.out.println(x));
				} catch (SQLException e) {
					e.printStackTrace();
				}
				break;
			case 6:
				try(UserDao udao=new UserDao()){
					System.out.println("Enter the id for which voting status to be changed:");
					int id=sc.nextInt();
					int c=udao.updateValue(id);
					System.out.println("Status changed. "+c+" row affected.");
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			default:
				break;
			}

		} while (choice!=0);
	}
}
