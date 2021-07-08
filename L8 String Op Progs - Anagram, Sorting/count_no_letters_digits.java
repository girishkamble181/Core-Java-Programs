// wap to read a string and count the number of letters , digits and others
//using inbuilt methods

import java.io.*;
class count_no_letters_digits
{
	public static void main(String args[])
	{
		Console c= System.console();
		
		String str= c.readLine("Enter a string ");
		char ch[]= str.toCharArray();
		
		int lc=0, uc=0, dc=0, oc=0;
		for(char k : ch)
		{
			if( Character.isLetter(k) )		lc++;
			else if(Character.isDigit(k))		dc++;
			else					oc++;
		}
		System.out.println(lc + " " + dc + " " + oc);
				
		
	}
}