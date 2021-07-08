// wap to read an n1 and n2 and perform ans = n1/n2
// from the user and print on the screen
// using CLA

class divide_program_exception
{
	public static void main(String args[])
	{
		System.out.println("work started");
			
		try
		{
			int n1 = Integer.parseInt(args[0]);
			int n2 = Integer.parseInt(args[1]);
			int res = n1 / n2;
			System.out.println("res = "+res);
		}	

		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("u shuld supply two integers ");
		}
		catch(NumberFormatException e)
		{
			System.out.println("u shuld supply integers");
		}
		catch(ArithmeticException e)
		{
			System.out.println("2nd number shuld not be 0");
		}
		
	
		System.out.println("work ended");
	}
}


// Exception --> runtime error
// Handling --> to prevent abnormal termination
// try with multiple catch