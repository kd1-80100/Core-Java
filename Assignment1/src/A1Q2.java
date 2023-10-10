import java.util.Scanner;

public class A1Q2 {
	public static void main(String[] args) {
		double n1, n2;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the value of n1:");
		if (scan.hasNextDouble() != scan.hasNextInt()) {
			n1 = scan.nextDouble();
			System.out.println("Datatype is Double.");
			System.out.print("Enter the value of n2:");
			if (scan.hasNextDouble() != scan.hasNextInt()) {
				n2 = scan.nextDouble();
				System.out.println("Datatype is Double.");
			} else {
				System.out.println("Datatype is other than double.");
			}
		} else {
			System.out.println("Datatype is other than double.");
		}
		scan.close();
	}
}
