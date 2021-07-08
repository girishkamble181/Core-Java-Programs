// OOP (Strong encapsulation)

class Employee
{
	private int id;
	private String name;
	private double salary;

	public void setData(int id, String name, double salary)
	{
		this.id= id;
		this.name= name;
		this.salary= salary;	
	}
	public void showData()
	{
		System.out.println("id = "+id);
		System.out.println("name = "+name);
		System.out.println("salary = "+salary);
	}
}

class oop_employee_strong_encapsulation
{
	public static void main(String args[])
	{
		Employee e1= new Employee();
		e1.setData(10,"Girish",5000);
		e1.showData();	
		
		System.out.println("");
		
		Employee e2= new Employee();
		e1.setData(20,"Kodag",8000);
		e1.showData();
	}

}