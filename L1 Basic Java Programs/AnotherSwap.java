// wap to read two integers and exchange and exhange thier value
// without using 3rd variable

class AnotherSwap
{
	public static void main(String args[])
	{
		int n1= Integer.parseInt(args[0]);
		int n2= Integer.parseInt(args[1]);
		System.out.println("n1 = " + n1 + " n2 = " + n2);

		n1= n1+n2;
		n2= n1-n2;
		n1= n1-n2;
		System.out.println("n1 = "+ n1 + " n2 = " + n2);
	}
}