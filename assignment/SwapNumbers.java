package assignment;

import java.util.Scanner;

public class SwapNumbers {

	public static void main(String[] args) {

		int a,b;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a value of a:");
		a = sc.nextInt();
		
		System.out.println("Enter a value of b:");
		b = sc.nextInt();
		
		sc.close();
		

		System.out.println();
		
		System.out.println("Before Swap");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
			
		int temp = a;
		a = b;
		b = temp;
		

		System.out.println();
		
		System.out.println("After Swap");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
	}

}
