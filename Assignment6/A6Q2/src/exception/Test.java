package exception;

import java.util.Scanner;

public class Test {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	
	Circle circle= new Circle();
	try {
	circle.accept(sc);
}
	catch(CircleException e)
	{
		e.printStackTrace();
	}
	finally{
		sc.close();
	}
}
}
