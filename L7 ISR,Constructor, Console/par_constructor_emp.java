//wap for emp details using CLA

class Employee
{
	static String cn= "KCS";
	int id;
	String name;
	double salary;

	Employee(int id, String name, double salary)
	{
		this.id = id;
		this.name= name;
		this.salary= salary;
	}
	public void showInfo()
	{
		System.out.println("id = "+id);
		System.out.println("name = "+name);
		System.out.println("salary  = "+salary);
		System.out.println("company = "+cn);
		
	}
}

class par_constructor_emp
{
	public static void main(String args[])
	{
		int id = Integer.parseInt(args[0]);
		String name = args[1];
		double salary= Double.parseDouble(args[2]);

		Employee e = new Employee(id, name, salary);
		e.showInfo();
	}
}