interface MyMath
{
	void add(int n1 , int n2);
}

class lambda_math_addition
{
	public static void main(String args[])
	{
	MyMath m1 = (int n1, int n2) -> { System.out.println("res = " +(n1+n2));};
	m1.add(10,20);

	MyMath m2 = (n1, n2) -> System.out.println("res = " +(n1+n2));
	m2.add(10, 20);
	}
}