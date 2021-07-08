// wap to read an integer and find if its even or odd

class EvenOdd
{
	public static void main(String args[])
	{
		int num = Integer.parseInt(args[0]);	
		String res= num % 2 == 0 ? "even" : "odd";
		System.out.println("res = "+res);
	
	}
}