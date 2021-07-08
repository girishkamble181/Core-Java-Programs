//wap to read three integers and find their product

class find_product
{
	public static void main(String args[])
	{
		int n1=Integer.parseInt(args[0]);	
		int n2=Integer.parseInt(args[1]);
		int n3=Integer.parseInt(args[2]);
		int res=n1 * n2 * n3;
		System.out.println("Res = "+res);
	}
}