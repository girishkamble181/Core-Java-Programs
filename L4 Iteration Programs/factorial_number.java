//wap to find factorial a number using for loop

class factorial_number
{
	public static void main(String args[])
	{
		int num= Integer.parseInt(args[0]);
		if (num < 0)
			System.out.println("Invalid ip");
		else
		{
			double fact = 1, i= 1;	
			for ( ; ; )
			{
				if (i > num )
					break;
				fact= fact * i++;
			}
			System.out.println("Fact= " +fact);		
		}
	
	}	
}