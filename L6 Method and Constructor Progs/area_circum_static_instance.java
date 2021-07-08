//wap to find area and circumference using static and instance variables/methods

class Circle
{
	private static final double PI = 3.14159;
	private double radius;

	public void setData(double radius)
	{
		this.radius= radius;
	}
	public void showData()
	{
		System.out.println("radius = "+radius);
	}
	
	public void area()
	{
		double ans= PI * radius * radius;
		System.out.printf("Area of circle = %.3f%n" ,+ans);
	}

	public void circumference()
	{
		double ans= 2* PI * radius; 
		System.out.printf("circumference of circle = %.3f%n", ans);
	}
}

class area_circum_static_instance
{
	public static void main(String args[])
	{
		Circle c= new Circle();
		c.setData(Double.parseDouble(args[0]));
		c.showData();
		c.area();
		c.circumference();
	}
}