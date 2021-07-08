//wap to read a StringBuffer and find its
// a palindrome  --> nitin, mam, wow

import java.io.*;
class palindrome_StringBuffer
{
	public static void main(String args[])	
	{
		Console c= System.console();
		StringBuffer sb= new StringBuffer(c.readLine("enter a string "));
	
		if(sb.toString().equals(sb.reverse().toString()))		//converted in string bzoc equals method is in String class
			System.out.println("yes");
		else
			System.out.println("no");
	}
}