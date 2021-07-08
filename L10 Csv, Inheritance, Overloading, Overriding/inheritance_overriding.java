// overriding --> changing func  --> subclass

class A
{
	void compute(double num)
	{
		double res = num * num;
		System.out.println("res = "+res);
	}
}

class B extends A
{
	void compute(double num)		//method signature
	{
		double res= Math.sqrt(num);
		System.out.println("res = "+res);
	}
}

class inheritance_overriding
{
	public static void main(String args[])
	{
		new A().compute(4);
		new B().compute(9);
	}	
}