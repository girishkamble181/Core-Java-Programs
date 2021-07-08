// interface 

interface Ks
{
	void rename();
	void miconoff();
}

class Pa implements Ks
{
	public void rename()
	{
		System.out.println("Participants");
	}

	public void miconoff()
	{
		System.out.println("Participants");
	}
}

class interface_prog_Ks_2
{
	public static void main(String args[])
	{
		Pa k =new Pa();
		k.rename();
		k.miconoff();
	}
}