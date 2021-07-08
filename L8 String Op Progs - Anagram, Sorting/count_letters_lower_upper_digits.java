// wap to read a string and count the number of lowercase, number of uppercase
//number of digits and other letters

import java.io.*;
class count_letters_lower_upper_digits
{
	public static void main(String args[])
	{
		Console c= System.console();
		
		String str= c.readLine("Enter a string");
		char ch[]= str.toCharArray();
		
		int lc=0, uc=0, dc=0, oc=0;
		for(char k : ch)
		{
			if(k >= 'a' && k <= 'z')		lc++;
			else if(k >= 'A' && k <= 'Z')		uc++;
			else if(k >= '0' && k <= '9')		dc++;
			else					oc++;
		}
		System.out.println(lc + " " + uc + " " + dc + " " + oc);
				
		
	}
}