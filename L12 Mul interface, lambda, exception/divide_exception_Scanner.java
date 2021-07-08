// Exception Handling 
// wap to read an n1 and n2 and perform ans = n1/n2
// from the user and print on the screen
// using Scanner 

import java.util.*;

class divide_exception_Scanner
{
	public static void main(String args[])
	{
		System.out.println("work started");
		Scanner s = new Scanner(System.in);
		
		try 
		{
		System.out.println("enter first integer");
		int n1 = s.nextInt();
	
		System.out.println("enter second integer");
		int n2 = s.nextInt();

		int res = n1 / n2;
		System.out.println("res = "+res );
		}
		
		catch(InputMismatchException e)
		{
			System.out.println("u shuld enter integers only");
		}
		catch(ArithmeticException e)
		{
			System.out.println("denominator shuld not be 0");
		}		

		System.out.println("work ended");
	}
}
