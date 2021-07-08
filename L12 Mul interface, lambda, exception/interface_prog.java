interface A
{
	void m();	
}

class B implements A
{
	public void m()
	{
		System.out.println("hi");
	}
}

class interface_prog
{
	public static void main(String args[])	
	{
		B b = new B();
		b.m();
	}
}