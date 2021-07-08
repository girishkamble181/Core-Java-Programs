//wap class Rectangle:
// IV: length and breadth
// IM: setData(), showData(), area(), perimeter()



class Rectangle
{
	private double length;
	private double breadth;

	public void setData(double length, double breadth)
	{
		this.length= length;	
		this.breadth= breadth;
	}

	public void showData()
	{
		System.out.println("length = "+length);	
		System.out.println("breadth = "+breadth);
	}
	
	public void area()
	{
		double ans= length * breadth;
		System.out.printf("Area = %.2f%n ",ans);
		
	}
	
	public void perimeter()
	{
		double ans= 2 * (length + breadth); 
		System.out.printf("Perimeter = %.2f%n ",ans);
		
	}


}

class RectangleTest_len_bdth
{
	public static void main(String args[])
	{
		double length = Double.parseDouble(args[0]);
		double breadth = Double.parseDouble(args[1]);
		
		Rectangle r= new Rectangle();
		r.setData(length,breadth);
		r.showData();
		r.area();
		r.perimeter();

	}
}