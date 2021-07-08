// wap to read a string and count the number of lowercase, number of uppercase
//number of digits and other letters
//using inbuilt methods

import java.io.*;
class count_UC_LC_digits_using_inbuiltMethods
{
	public static void main(String args[])
	{
		Console c= System.console();
		
		String str= c.readLine("Enter a string ");
		char ch[]= str.toCharArray();
		
		int lc=0, uc=0, dc=0, oc=0;
		for(char k : ch)
		{
			if( Character.isLowerCase(k) )		lc++;
			else if(Character.isUpperCase(k))	uc++;
			else if(Character.isDigit(k))		dc++;
			else					oc++;
		}
		System.out.println(lc + " " + uc + " " + dc + " " + oc);
				
		
	}
}