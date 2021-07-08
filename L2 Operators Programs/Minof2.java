//wap to read two integers and find the min of two


class Minof2
{
	public static void main(String args[])
	{
		int n1=Integer.parseInt(args[0]);
		int n2=Integer.parseInt(args[1]);
		int res= (n1 < n2) ? n1 : n2;
		System.out.println("min = "+res);
	}
}