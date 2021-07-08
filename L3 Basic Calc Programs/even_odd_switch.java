// switch case 

class even_odd_switch
{
	public static void main(String args[])
	{
		int num= Integer.parseInt(args[0]);
		int res= num%2;
		
		//Logic 3
		switch(res)
		{
			case 0: System.out.println("Even 1");
				break;
			case 1,-1: System.out.println("odd 2");
				break;
		}
		
		//Logic 4

		switch(res)
		{
			case 0: System.out.println("even 2");
			break;
			default :System.out.println("odd 2");
			break;
		}

		//Logic 5

		switch(res)
		{
			case 0 -> System.out.println("even 3");
			default -> System.out.println("odd 3");
		}


	}
}