// Exception Handling 
// wap to read an n1 and n2 and perform ans = n1/n2
// from the user and print on the screen
// using Console

import java.io.*;
class divide_exception_console
{
	public static void main(String args[])
	{
		System.out.println("work started");
		Console c = System.console();
		try
		{
			int n1 = Integer.parseInt(c.readLine("enter first integer "));
			int n2 = Integer.parseInt(c.readLine("enter second integer "));
			int res = n1 / n2;
			System.out.println("res = "+res);
		}

		catch(NumberFormatException e)
		{
			System.out.println("number shuld be integer only");
		}
	
		catch(ArithmeticException e)
		{
			System.out.println("denominator shuld not be 0");
		}
		System.out.println("work ended");
	}
}