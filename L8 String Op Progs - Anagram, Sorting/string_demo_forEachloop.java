//wap to demo String .. declare and display

class string_demo_forEachloop
{
	public static void main(String args[])
	{
		String s1= "KC Vashi";
		System.out.println(s1);
	
		String s2= new String("KC Panvel");
		System.out.println(s2);

		String s3= """
				Core java, adv java, JSP, JPMS, Hibernate, Android,
				Python, Django, ML, Flask """;
		System.out.println(s3);

		char ch[] = s1.toCharArray();

		//for each loop / enchanced for loop
		for(char pp: ch)
			System.out.print(pp);
		System.out.println();
		
		//traditional for loop
		for(int i=0; i<ch.length; i++)
			System.out.print(ch[i]);		

		
	}
}