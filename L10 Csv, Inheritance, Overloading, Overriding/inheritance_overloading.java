// overloading --> adding func   same class/sub class

class P
{
	void add(int a, int b)
	{
		int res = a + b;
		System.out.println("res = "+res);
	}

	void add(int a, int b, int c)
	{
		int res= a + b + c;
		System.out.println("res = "+res);	
	}

}

class Q extends P
{
	void add(int a, int b, int c, int d)
	{
		int res = a + b + c + d;
		System.out.println("res = "+res);
	}	

}

class inheritance_overloading
{
	public static void main(String args[])
	{
		new P().add(10 ,20);
		new P().add(40, 10, 20);
		new Q().add(2, 3);
		new Q().add(4, 5, 6);
		new Q().add(5 ,6 , 9, 2);
		//new P().add(1 , 3, 4, 5);    not work
	}
}