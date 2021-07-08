interface MyCompute
{
	double square(double num);
}

class lamda_square_interface2
{
	public static void main(String args[])
	{
		MyCompute m1 = (double num) -> { return num * num ; };
		System.out.println(m1.square(5));

		MyCompute m2 = (num) -> { return num * num ; };
		System.out.println(m2.square(5));
		
		MyCompute m3 = num -> { return num * num ; };
		System.out.println(m3.square(5));
	
		MyCompute m4 = num -> num * num;
		System.out.println(m4.square(5));
	}
}