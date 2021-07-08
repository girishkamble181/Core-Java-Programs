interface MyCompute
{
	void square(double num);
}

class lamda_sqr_interface
{
	public static void main(String args[])
	{
		MyCompute m1 = (double num) -> { System.out.println("square = " + (num * num));};
		m1.square(4);

		MyCompute m2 = (num)-> { System.out.println("square = " + (num * num));};
		m2.square(4);

		MyCompute m3 = num -> System.out.println("square = " + (num * num));
		m3.square(4);
		
	}
}