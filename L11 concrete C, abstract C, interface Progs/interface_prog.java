// interface class

interface C1
{
	void m1();
	void m2();
}

class C2 implements C1
{
	public void m1()
	{
		System.out.println("coll");
	}
	
	public void m2()
	{
		System.out.println("coll");
	}
}

class interface_prog
{
	public static void main(String args[])
	{
		C2 c= new C2();
		c.m1();
		c.m2();
	}
}

// enforce all the rules