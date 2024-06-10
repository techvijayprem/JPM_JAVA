package exceptionExample;

import java.util.Scanner;

public class Exception_1 {
	
	public static void main(String [] args)
	{
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter the first number: ");
			 int number1 = sc.nextInt();
			 
			 System.out.print("Enter the Second number: ");
			 int number2 = sc.nextInt();
			 
			 try
			 {
			     int result = number1 / number2;
			     System.out.println(result);
			 }
			 catch(Exception e)
			 {
				 System.out.println("Can't divide "+e.getMessage());
			 }
		}
	}

}
