interface Actor
{
	void act();
	void speak();
	static void comedy() { System.out.println("comedy"); }
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

class mulitple_interface_actor3
{
	public static void main(String args[])
	{
		Hero h = new Hero();
		h.act();
		h.speak();
		Actor.comedy();

		Villain v = new Villain();
		v.act();
		v.speak();
		Actor.comedy();
		
	}
}