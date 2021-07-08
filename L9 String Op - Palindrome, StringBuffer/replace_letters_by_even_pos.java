//wap to read string and replace even position with uppercase letter
// and odd position with lower case letter
// girish   ==>  gIrIsH

import java.io.*;
class replace_letters_by_even_pos
{
	public static void main(String args[])
	{
		Console c= System.console();
		String str = c.readLine("enter a string ");
		String nstr = "";

		for(int i= 0; i<str.length(); i++)
		{
			if(i % 2 == 0)
				nstr= nstr + (str.charAt(i) + "").toUpperCase();
			else
				nstr= nstr + (str.charAt(i) + "").toLowerCase();
		}
		System.out.println(str);
		System.out.println(nstr);
	}
}