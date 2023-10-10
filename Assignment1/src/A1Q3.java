import java.util.Scanner;

/*
3. Display food menu to user. User will select items from menu along with the quantity. (eg 1. Dosa
2. Samosa 3. Idli ... 10 . Generate Bill ) Assign fixed prices to food items(hard code the prices)
When user enters 'Generate Bill' option , display total bill & exit.
 */
public class A1Q3 {
	public static void main(String[] args) throws InterruptedException {
		int choice, n, bill = 0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("********************************************");
			System.out.println("***Menu Card***");
			System.out.println("1.Dosa--35Rs\n2.Samosa---15Rs\n3.Idli--25Rs\n4.Pohe--20Rs\n5.Tea--10Rs");
			System.out.println("6.Generate Bill\n7.Pay the bill.\0.Exit");
			System.out.println("********************************************");
			System.out.print("Enter Menu choice:");
			choice = sc.nextInt();
			switch (choice) {
			case 1: {
				int price = 35;
				System.out.println("Enter the quantity of Dosa: ");
				n = sc.nextInt();
				System.out.println("	Dosa:" + price * n);
				bill = bill + price * n;
				break;
			}
			case 2: {
				int price = 15;
				System.out.println("Enter the quantity of Samosa: ");
				n = sc.nextInt();
				System.out.println("	Samosa:" + price * n);
				bill = bill + price * n;
				break;
			}
			case 3: {
				int price = 25;
				System.out.println("Enter the quantity of Idli: ");
				n = sc.nextInt();
				System.out.println("	Idli:" + price * n);
				bill = bill + price * n;
				break;
			}
			case 4: {
				int price = 20;
				System.out.println("Enter the quantity of Pohe: ");
				n = sc.nextInt();
				System.out.println("	Pohe:" + price * n);
				bill = bill + price * n;
				break;
			}
			case 5: {
				int price = 10;
				System.out.println("Enter the quantity of Tea: ");
				n = sc.nextInt();
				System.out.println("	Tea:" + price * n);
				bill = bill + price * n;
				break;
			}
			case 6:
				System.out.println("	Your Total Bill is " + bill+"Rs");
				break;
			case 7:
				System.out.println("Press 1 for Online payment\nPress 2 for Cash payment");
				int p1 = sc.nextInt();
				if (p1 == 1 || p1 == 2) {
					System.out.println("	Thank you..\n******Payment received.******");
					System.out.println("Please press 0 to exit.");
				} else {
					System.out.println("	Payment failed..\n***Please try again for payment.***");
				}
				break;
			}
		} while (choice != 0);
		System.out.println("Thank you for visiting our restaurant..\nHave a nice day..!");
		sc.close();
	}
}