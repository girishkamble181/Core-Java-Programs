//wap to read radius from the user and find the area & circum of the circle

class AreaCircum
{
	public static void main(String args[])
	{
		final double PI= 3.14159;
		double radius= Double.parseDouble(args[0]);
		double area= PI * radius * radius ;
		double circum= 2 * PI * radius;
		
		System.out.println("area = " +area);
		System.out.println("circumference = "+ circum);
		
		System.out.printf("area= %.2f%n" , area);
		System.out.format("circumference= %.2f%n", circum);	

	}
}