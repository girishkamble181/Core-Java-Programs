// passing reference variable


class pass_ref_variable
{
	public static void change(StringBuffer rb)
	{
		rb.append("Eye");	
	}

	public static void main(String args[])
	{
		StringBuffer sb= new StringBuffer();
		sb.append("Dead");
		System.out.println(sb);
		change(sb);
		System.out.println(sb);
	}
}