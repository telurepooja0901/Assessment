package assignment;

import java.util.Scanner;

public class InchToMeter {

	public static void main(String[] args) 
	{
		int a; double m;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Value in inch: ");
		a = input.nextInt();
		
		input.close();
		
		m = a*0.0254;
		
		
		System.out.println("The Value in Meter: " + m);
		
		
		
	}

}
