// wap to find the sum of first "n" +ve integers using forloop

class first_n_positive_integers_4
{
	public static void main(String args[])
	{
		int num= Integer.parseInt(args[0]);
		if (num < 0)
			System.out.println("Invalid IP");
		else
		{
			int sum= 0;
			for (int i=1; i <= num; i++ )	
				sum= sum + i;	

			System.out.println("Sum = " +sum);
		}
		
	}
}