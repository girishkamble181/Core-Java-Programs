//wap to find the sum of the numbers supplied from CLA
// using var args( using for each)

class sum_var_args
{
	public static void main(String ... args)
	{
		double res= 0;
		for (String k : args)
			res = res + Double.parseDouble(k);
		System.out.println(res);
	}
}