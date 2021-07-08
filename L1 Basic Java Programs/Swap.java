// wap to read two integers and exchange and exhange thier value

class Swap
{
	public static void main(String args[])
	{
		int n1= Integer.parseInt(args[0]);
		int n2= Integer.parseInt(args[1]);
		System.out.println("n1 = " + n1 + " n2 = " + n2);

		int n3= n1;
		n1= n2;
		n2= n3;
		System.out.println("n1 = "+ n1 + " n2 = " + n2);
	}
}