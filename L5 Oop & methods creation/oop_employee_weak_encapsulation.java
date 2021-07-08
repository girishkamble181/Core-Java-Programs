// OOP (weak encapsulation)

class Employee
{
	int id;
	String name;
	double salary;

	void setData(int i, String n, double s)
	{
		id= i;
		name= n;
		salary= s;	
	}
	void showData()
	{
		System.out.println("id = "+id);
		System.out.println("name = "+name);
		System.out.println("salary = "+salary);
	}
}

class oop_employee_weak_encapsulation
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