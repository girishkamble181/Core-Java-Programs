//overriding --> changing
class Parent
{
	public void greet()
	{
		System.out.println("namaste");
	}
}

class Child extends Parent
{
	public void greet()
	{
		System.out.println("yo");
	}
}

class overriding_parent_child
{
	public static void main(String args[])
	{
		Parent p = new Parent();
		p.greet();
		Child c = new Child();	
		c.greet();	
	}
}