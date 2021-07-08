//wap to find the sum of the digits
//using while loop

class sum_of_dig
{
	public static void main(String args[])
	{
		int num= Integer.parseInt(args[0]);
		if (num < 0)
			System.out.println("Invalid Input");
		else
		{
			int sum=0, digit=0;
			while(num > 0)
			{
				digit= num % 10;		// get last digit
				sum= sum + digit;		//use last digit
				num= num / 10;			//remove last digit
			}
			System.out.println("sum = "+sum);
			
		}
	}
}