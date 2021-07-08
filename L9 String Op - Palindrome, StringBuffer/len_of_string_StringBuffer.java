//wap to read a StringBuffer and find the length of the string
// using readymade method and w/o using readymade method

import java.io.*;
class len_of_string_StringBuffer
{
	public static void main(String args[])
	{
		Console c= System.console();
		StringBuffer sb= new StringBuffer(c.readLine("enter a string "));
		
		int len1=0, len2=0;
	
		len1= sb.length();
		System.out.println("length of 1st string is = "+len1);

		char ch[] = sb.toString().toCharArray();		//first convert sb to string then convert string into CharArray
		for(char k : ch)
			len2++;

		System.out.println("length of 2nd string is = "+len1);
	}
}