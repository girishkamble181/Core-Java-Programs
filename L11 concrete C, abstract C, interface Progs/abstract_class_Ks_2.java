//abstract class

abstract class Ks
{
	public abstract void rename();
	
	public void miconoff()
	{
		System.out.println("ks");
	}
}

class Pa extends Ks
{
	public void rename()
	{
		System.out.println("Participants");
	}
}

class abstract_class_Ks_2
{
	public static void main(String args[])
	{
		Pa k = new Pa();
		k.rename();
		k.miconoff();
	}
}