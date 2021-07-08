// OOP

class Student
{
	int rno;
	String name;
	
	void setData(int r, String n)
	{
		rno = r;
		name = n;
	}
	void showData()
	{
		System.out.println("rno = "+rno);
		System.out.println("name = "+name);
	}	

}

class oop_1
{
	public static void main(String args[])
	{
		Student s= new Student();
		s.setData(20, "Girish ");
		s.showData();
	}
}


