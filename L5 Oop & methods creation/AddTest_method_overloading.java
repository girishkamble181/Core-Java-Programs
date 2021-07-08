/*
wap for method overloading
-- number of par, type of par / or sequence of par
	compute: adding two integers
	compute: adding three integers
*/

class Add
{
	public void compute(int n1, int n2)
	{
		int res= n1 + n2;
		System.out.println("res = "+res);
	}
	public void compute(int n1, int n2, int n3)
	{
		int res= n1 + n2 + n3;
		System.out.println("res = "+res);
	}
}

class AddTest_method_overloading
{
	public static void main(String args[])
	{
		Add a= new Add();
		a.compute(10,20);	
		a.compute(4,5,8);
		a.compute(9,2);
	}
}