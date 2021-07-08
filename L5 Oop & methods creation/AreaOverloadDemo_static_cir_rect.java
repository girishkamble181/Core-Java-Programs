// wap for find area of circle and rect using method over (Static)

class AreaOverload
{
	public static void area(double radius)
	{
		double ans = 3.14 * radius * radius;
		System.out.println("area of circle = "+ans);
	}
	public static void area(double length, double breadth)
	{
		double ans = length * breadth;
		System.out.println("area of rectangle = "+ans);
	}
}

class AreaOverloadDemo_static_cir_rect
{
	public static void main(String args[])
	{
		AreaOverload.area(3.4);
		AreaOverload.area(4.5, 6.7);
		AreaOverload.area(4.5 , 9.0 );
		AreaOverload.area(7.8);
	
	}
}