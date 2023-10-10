public class A1Q4_3 {
	public static void main(String[] args) {
		int row=6;
		for (int i = 1; i <=row; i++) {
			for (int j = 1; j <= row-i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <=2*i-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}