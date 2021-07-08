// wap to find the sum of first "n" +ve integers using do-while

class first_n_positive_integers_3
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
			do
			{
				sum = sum + i;
				i++;
			}
			while(i <= num);
			System.out.println("Sum = " +sum);
		}
		
	}
}