import java.io.*;

class Student
{
	int rno;		
	String name;
	
	Student(int rno, String name)
	{
		this.rno= rno;
		this.name= name;
	}

	void show()
	{
		System.out.println(rno+ " "+name);
	}
}

class student_data_console
{
	public static void main(String args[])
	{
		Console c= System.console();
		int n = Integer.parseInt(c.readLine("enter number of students "));

		if (n > 0)
		{
			Student data[]= new Student[n];
			for(int i=0; i<n; i++)
			{
				int rno = Integer.parseInt(c.readLine("enter rno "));
				String name = c.readLine("enter name ");
				data[i] = new Student(rno, name); 
			}
			for(Student k: data)
				k.show();			
			}
		else
		{
			System.out.println("atleast 1 student shud be there");
		}
	}
}
