package assignment;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) 
	{
		
		  Scanner sc = new Scanner(System.in);
		   
		  System.out.print("Input a number: ");
		  
		  int num1 = sc.nextInt();
		  
		  sc.close();
		   
		  for (int i = 0; i < 10; i++)
			 
		  
		  {
			  
		     System.out.println(num1 + " x " + (i + 1) + " = " + (num1 * (i + 1)));
		     
		  }
		
	}

}
