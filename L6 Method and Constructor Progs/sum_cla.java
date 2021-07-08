//wap to find the sum of the numbers supplied from CLA


class sum_cla
{
	public static void main(String args[])
	{
		double res= 0;
		for (int i = 0 ; i< args.length; i++)
			res = res + Double.parseDouble(args[i]);
		System.out.println(res);
	}
}