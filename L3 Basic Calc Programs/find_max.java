// wap to read three numbers and find the max of 3

class find_max
{
	public static void main(String args[])	
	{
		double n1= Double.parseDouble(args[0]);
		double n2= Double.parseDouble(args[1]);
		double n3= Double.parseDouble(args[2]);
		double res= 0;
			

		if (n1 > n2)
			res= n1;
		else
			res= n2;

		if (n3 > res )
			res= n3;

		System.out.println("Max of 3 = " +res);
	}
}
