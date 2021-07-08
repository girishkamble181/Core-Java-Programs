//wap for display radius using Contructor Overloading

class Circle
{
	double radius;
	
	Circle()		//without parameter
	{
		radius= 0.0;
	}

	Circle(double radius)		//with parameter
	{
		this.radius = radius;
	}
	
	void showData()
	{
		System.out.println("radius = "+radius);
	}
}

class radius_constructor_overloading
{
	public static void main(String args[])
	{
		Circle c1= new Circle();
		c1.showData();
	
		Circle c2= new Circle(9.2);
		c2.showData();
	}
}