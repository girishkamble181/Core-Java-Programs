//wap for find area of circle and rect using method overloading

class AreaOverload
{
	public void area(double radius)
	{
		double ans= 3.14 * radius * radius;
		System.out.println("Area of circle = "+ans);
	}
	public void area(double length, double breadth)
	{
		double ans= length * breadth;
		System.out.println("Area of Rectangle = "+ans);
	}
}

class AreaOverloadTest_cir_rect
{
	public static void main(String args[])
	{
		AreaOverload a= new AreaOverload();
		a.area(3,4);	
		a.area(4.5, 6.7);
		a.area(4.5,9.0);
		a.area(7.8);	
	}

}