//overloading --> adding

class Parent
{
	public void income()
	{
		System.out.println("we earn from our business");
	}
}

class Child extends Parent
{
	public void income(String comp)
	{
		System.out.println("i earn from my job");
	}
}

class overloading_parent_child
{
	public static void main(String args[])
	{
		Parent p = new Parent();
		p.income();
		Child c = new Child();	
		c.income();
		c.income("TCS");
	}
}