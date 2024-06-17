package assignment;

import java.util.Scanner;

public class AreaOfRectangle {

	public static void main(String[] args)
	{

		int l, b, a, p;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the Length: ");
		l = input.nextInt();
		
		System.out.println("Enter the breadth: ");
		b = input.nextInt();
		
		input.close();
		
		a = l * b;
		p = 2 * (l + b);
		
		System.out.println("The Area of Rectangle is: " + a);
		System.out.println("The Perimeter of Rectangle is: " + p);

		}

}
