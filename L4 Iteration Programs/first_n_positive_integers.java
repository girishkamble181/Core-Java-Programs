// wap to find the sum of first "n" +ve integers using while

class first_n_positive_integers
{
	public static void main(String args[])
	{
		int num= Integer.parseInt(args[0]);
		if (num < 0)
			System.out.println("Invalid IP");
		else
		{
			int sum= 0;
			int i= 1;
			while(i <= num)
			{
				sum = sum + i;
				i++;
			}
			System.out.println("Sum = " +sum);
		}
		
	}
}