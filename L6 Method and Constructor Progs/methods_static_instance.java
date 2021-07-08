class Student
{
	private static String cn= "Girish Tutorials";     //static variable
	private int rno;   			       //instance variable
	private String name;			       //instance variable
	
	public void setData(int rno, String name)	//instance method
	{
	     // IV      = LV
		this.rno= rno;
		this.name= name;
	}
	public void showData()				//instance method
	{
		System.out.println("Rno = "+rno);
		System.out.println("Name = "+name);
	}
	public static void showClassName()		//static method
	{
		System.out.println("class name = "+cn);
	}
}

class methods_static_instance
{
	public static void main(String args[])	
	{
		Student s1= new Student();
		s1.setData(10,"Girish");
		s1.showData();
		s1.showClassName();

		Student s2= new Student();
		s2.setData(20,"shyam");
		s2.showData();
		s2.showClassName();
	}
}


//static --> 		class / objects
//non static -->	Objects	 



