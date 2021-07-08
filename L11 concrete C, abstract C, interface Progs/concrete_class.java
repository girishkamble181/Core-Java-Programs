// concrete class

class C1
{
	public void m1()
	{
		System.out.println("univ");
	}
	
	public void m2()
	{
		System.out.println("univ");
	}
}

class concrete_class
{
	public static void main(String args[])
	{
		C1 c= new C1();
		c.m1();
		c.m2();
	}
}