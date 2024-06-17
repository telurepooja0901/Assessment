package assignment;

import java.util.Scanner;

public class GreatestNumber {

	public static void main(String[] args) {

		

		int a, b, c;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter ther first Number:" );
		a = sc.nextInt();
		
		System.out.println("Enter ther Second Number:" );
		b = sc.nextInt();
		
		System.out.println("Enter ther Third Number:" );
		c = sc.nextInt();
		
		sc.close();
		
		for (int i = 0; i <= 25; i++)
		System.out.print("-" );
		
		System.out.println();
		
		
		int result = (a > b ? (a > c ? a : c) : (b > c ? b : c));
		
		System.out.println("The Greatest Number is: " + result );
		
	}

}
