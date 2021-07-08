// abstract class

abstract class C1
{
	public void m1()
	{
		System.out.println("univ");
	}
	
	public abstract void m2();
}

class C2 extends C1
{
	public void m2()
	{
		System.out.println("coll");
	}
}

class abstract_class_prog
{
	public static void main(String args[])	
	{
		C2 c= new C2();
		c.m1();		
		c.m2();
	}
}


// Abstract class is used for enforcing business rules