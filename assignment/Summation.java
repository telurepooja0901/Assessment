package assignment;

import java.util.Scanner;

public class Summation {

	public static void main(String[] args)
	{

		int a, b, c = 0;
		 
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter ther first Number:" );
		a = sc.nextInt();
		
		System.out.println("Enter ther Second Number:" );
		b = sc.nextInt();
		
		sc.close();
		
		c = a + b;
		

		for (int i = 0; i <= 25; i++)
		System.out.print("-" );

		System.out.println();     
		
		
		
		System.out.println("The Sum of Two Numbers is: " + c);
	}

}
