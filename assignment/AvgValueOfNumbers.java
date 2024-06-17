package assignment;

import java.util.Scanner;

public class AvgValueOfNumbers {

	public static void main(String[] args) 
	{

		int a, b, c,  sum;
		
		int avg;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first number :  ");
		a = sc.nextInt();
	

		System.out.println("Enter second number : ");
		b = sc.nextInt();
		
		System.out.println("Enter third number : ");
		c = sc.nextInt();
		sc.close();
		

		for (int i = 0; i <= 25; i++)
		System.out.print("-" );

		System.out.println();     
		
		 sum = a + b + c;
		 avg = ((a + b + c) / 3);

		 System.out.print("Sum : " + sum + "\nAverage : " + avg);
		    
	}

}
