//static concept

class Student
{
	static String cn= "kn classes";
	int rno;
	String name;
}

class Student_static_concept
{
	public static void main(String args[])
	{
		Student s1= new Student();
		s1.rno=10;
		s1.name="girish";
		System.out.println(s1.rno + " " + s1.name + " " + s1.cn);
	
		Student s2= new Student();
		s2.rno=20;
		s2.name="kodag";
		System.out.println(s2.rno + " " + s2.name + " " + s2.cn);

		Student s3= new Student();
		s3.rno=30;
		s3.name="indra";
		System.out.println(s3.rno + " " + s3.name + " " + s3.cn);
	}
}