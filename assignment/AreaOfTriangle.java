
package assignment;

import java.util.Scanner;

public class AreaOfTriangle {

	public static void main(String[] args)
	{

		int a, b, c, sp;
		double area; 
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the Value of First Side: ");
		a = input.nextInt();
		
		System.out.println("Enter the Value of Second Side: ");
		b = input.nextInt();
		
		System.out.println("Enter the Value of Third Side: ");
		c = input.nextInt();
		
		input.close();
		
		sp = (a + b + c) / 2;
		area = Math.sqrt (sp*(sp-a)*(sp-b)*(sp-c));
		
		System.out.println("The Area of Triangle is: " + area);
		
	}

}
