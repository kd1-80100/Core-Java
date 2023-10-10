import java.util.Scanner;
public class A1Q1 {
	public static void main(String[] args) {
		int n1;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number:");
		n1 = scan.nextInt();
		System.out.println("Given number:" + n1);
		System.out.println("Binary conversion of " + n1 + " is:" + Integer.toBinaryString(n1));
		System.out.println("Octal conversion of " + n1 + " is:" + Integer.toOctalString(n1));
		System.out.println("HexaDecimal conversion of " + n1 + " is:" + Integer.toHexString(n1));
		scan.close();
	}
}
