interface A
{
	void m();
}

class interface_lambda_single_abstract_methd
{
	public static void main(String args[])
	{
		A a  = () -> System.out.println("kaisa laga ");
		a.m();

		A b = () -> 
		{
		System.out.println("1st stmt");
		System.out.println("1st stmt");
		};
		b.m();
		
	}
}

// lambda exp --> i/f ka shorthand implm
// i/f  -->  functional i/f  -->  single abstract method SAM
// par --> body