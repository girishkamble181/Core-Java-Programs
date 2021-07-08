//wap to read a StringBuffer and find its
// a palindrome  --> nitin, mam, wow

import java.io.*;
class palindrome_2
{
	public static void main(String args[])	
	{
		Console c= System.console();
		StringBuffer sb= new StringBuffer(c.readLine("enter a string "));

		String s = sb.toString();
		String r = sb.reverse().toString();
	
		if(s.equals(r))		
			System.out.println("yes");
		else
			System.out.println("no");
	}
}