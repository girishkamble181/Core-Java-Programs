// wap to read two integers and find the min of two
//using if else stmt

class min_ifelse
{
	public static void main(String args[])	
	{
		int n1= Integer.parseInt(args[0]);
		int n2= Integer.parseInt(args[1]);
		
		if (n1 < n2)
			System.out.println(n1 + " is min");
		else
			System.out.println(n2+ " is min");
	}
}
