// wap to find the reverse of the given number
// using do while loop

class reverse_number
{
	public static void main(String args[])
	{
		int num= Integer.parseInt(args[0]);
		if (num < 0)
			System.out.println("Invalid input");
		else
		{
			System.out.println("org = "+num);
			int rev= 0, digit= 0;
			do
			{
				digit= num % 10;	//get last digit
				rev= rev * 10 + digit;	//use last digit
				num= num / 10;		//rem last digit
			}
			while(num > 0);
			System.out.println("Rev num is = "+rev);
		}

	}
}