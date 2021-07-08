// wap to read integers and find the max of them
// using for var args

class max_var_args
{
	public static void main(String ... args)
	{
		if (args.length > 0)
		{
			int res= Integer.parseInt(args[0]);
			
			for(String k : args)
			{
				if (Integer.parseInt(k) > res)
					res= Integer.parseInt(k);
			}
			System.out.println("Max = "+res);
		}
	}
}