package assignment;

import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) 
	{
		int r;
		double perimeter, area;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the Radius of Circle: ");
		r = input.nextInt();
		
		input.close();
		
		perimeter =2 *3.14 *r;
		area = 3.14*r*r;
		
		
		System.out.println("The Perimeter of Circle: " + perimeter);
		System.out.println("The area of Circle: " + area);
		
		
		
	}

}
