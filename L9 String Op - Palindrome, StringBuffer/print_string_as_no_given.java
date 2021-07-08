//wap to read a string and print as follows:
// camel	caammmeeeelllll
// 12345

import java.io.*;
class print_string_as_no_given
{
	public static void main(String args[])
	{
		Console c= System.console();
		String str= c.readLine("enter a string ");
		String nstr = "";
		
		for(int i=0; i<str.length(); i++)
		{
			char ch= str.charAt(i);
			for (int j = 1; j <= i+1; j++)
				System.out.print(ch);
		}

	}
}