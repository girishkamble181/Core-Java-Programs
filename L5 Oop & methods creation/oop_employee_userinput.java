// OOP (Strong encapsulation) using userinput

class Employee
{
	private int id;
	private String name;
	private double salary;

	public void setData(int i, String n, double s)
	{
		id= i;
		name= n;
		salary= s;	
	}
	public void showData()
	{
		System.out.println("id = "+id);
		System.out.println("name = "+name);
		System.out.println("salary = "+salary);
	}
}

class oop_employee_userinput
{
	public static void main(String args[])
	{
		Employee e1= new Employee();
		e1.showData();	
		e1.setData(Integer.parseInt(args[0]), args[1], Double.parseDouble(args[2]));
		e1.showData();
	}

}