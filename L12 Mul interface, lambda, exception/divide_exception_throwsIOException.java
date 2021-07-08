// Exception Handling 
// using throws IOException
// wap to read an n1 and n2 and perform ans = n1/n2
// from the user and print on the screen
// using InputSreamReader and BufferedReader

import java.io.*;
class divide_exception_throwsIOException
{
	public static void main(String args[]) throws IOException
	{
		System.out.println("work started");
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		try
		{
			System.out.println("enter first integer ");
			int n1 = Integer.parseInt(br.readLine());
			System.out.println("enter second integer ");
			int n2 = Integer.parseInt(br.readLine());
			
			int res = n1 / n2;
			System.out.println("res = "+res);
		}
	
		catch(NumberFormatException e)
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


