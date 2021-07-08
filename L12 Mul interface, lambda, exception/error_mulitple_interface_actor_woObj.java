interface Actor
{
	void act();
	void speak();
	void comedy();
}

class Hero implements Actor
{
	public void act()
	{
		System.out.println("I can act");
	}
	public void speak()
	{
		System.out.println("I can speak eng and hindi");
	}
	public void comedy()
	{
		System.out.println("I can do comedy");
	}
}

class Villain implements Actor
{
	public void act()
	{
		System.out.println("I can act");
	}
	public void speak()
	{
		System.out.println("I can speak marathi and hindi");
	}
	
}

class error_mulitple_interface_actor_woObj
{
	public static void main(String args[])
	{
	
	}
}