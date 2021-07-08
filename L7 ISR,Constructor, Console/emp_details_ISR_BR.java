//wap for Emp details using IO 

import java.io.*; 	//java -- pkg, io -- subpkg, * -- all

class Employee
{
	static String cn= "KCS";		//static variable
	int id;
	String name;
	double salary;

	Employee(int id, String name, double salary)		// parameterized constructor
	{
		this.id= id;
		this.name= name;
		this.salary= salary;
	}
	public void showInfo()
	{
		System.out.println("id = "+id);
		System.out.println("name = "+name);
		System.out.println("salary = "+salary);
		System.out.println("Company name = "+cn);
	}
}

class emp_details_ISR_BR
{
	public static void main(String args[]) throws IOException
	{
		InputStreamReader isr= new InputStreamReader(System.in);	//  for input from keyboard
		BufferedReader br = new BufferedReader(isr);			// to make io efficient

		System.out.println("enter emp id");
		int id = Integer.parseInt(br.readLine());
		
		System.out.println("enter emp name");
		String name= br.readLine();
		
		System.out.println("enter emp salary");
		double salary = Double.parseDouble(br.readLine());

		Employee e = new Employee(id, name, salary);
		e.showInfo();
		
	}
}