// wap to find the square root of number
// handle the  exception
// checked exception

class checked_exception_sqrt
{
	public static void main(String args[])
	{
		System.out.println("work started");
	
		try
		{
			double num = Double.parseDouble(args[0]);
			if (num < 0)
				throw new Exception("number shuld not ne -ve");
			double res = Math.sqrt(num);
			System.out.println("res = " +res);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("u need to enter one number");
		}
		catch(NumberFormatException e)
		{
			System.out.println("u need to enter one number only");
		}
		catch(Exception e)
		{
			System.out.println("issue "+e);
		}
		System.out.println(" work ended");
	}
}