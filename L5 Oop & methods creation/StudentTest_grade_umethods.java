/* wap for class Student: IV: rno, name, marks
			  IM: setData(), showData(), findGrade()

m>=80 --> Grade A,  m>=60 --> Grade B, else Grade C
*/

class Student
{
	private int rno;
	private String name;
	private int marks;

	public void setData(int rno, String name, int marks)
	{
		this.rno = rno;
		this.name= name;
		this. marks= marks;
	}

	public void showData()
	{
		System.out.println("Rno = "+rno);
		System.out.println("Name = "+name);
		System.out.println("Marks = "+marks);
	}

	public void findGrade()
	{
		if (marks < 0 || marks > 100)
			System.out.println("Invalid Marks");
		else if (marks >= 80)
			System.out.println("Grade A");
		else if (marks >= 60)
			System.out.println("Grade B");
		else
			System.out.println("Grade C");
	}
	
}

class StudentTest_grade_umethods
{
	public static void main(String args[])
	{
		int rno= Integer.parseInt(args[0]);
		String name= args[1];
		int marks= Integer.parseInt(args[2]);

		Student s= new Student();
		s.setData(rno,name,marks);
		s.showData();
		s.findGrade();
	}
}


