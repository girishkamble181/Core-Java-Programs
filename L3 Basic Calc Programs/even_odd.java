// wap to read an integer from CLA and find if the number is even or odd
//using if else, switch

class even_odd
{
	public static void main(String args[])
	{
		int num=Integer.parseInt(args[0]);
	
		//Logic 1
		if (num % 2 == 0)
			System.out.println("Even Number ");
		else
			System.out.println("Odd Number ");

		//Logic 2
		
		int res= num%2;
		switch(res)
		{
			case 0: System.out.println("Even");
			break;
			case 1: System.out.println("Odd");
			break;
			case -1: System.out.println("odd");
			break;
		}
			

	}
}