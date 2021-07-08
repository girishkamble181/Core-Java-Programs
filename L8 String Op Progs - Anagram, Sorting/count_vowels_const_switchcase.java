//wap to read a string and count the
//number of vowels and constants
//using switch case

import java.io.*;
class count_vowels_const_switchcase

{
	public static void main(String args[])
	{
		Console c= System.console();
		
		String str= c.readLine("enter a string ");
		char ch[]= str.toCharArray();
	
		int vc=0 ,cc=0;
		for(char k : ch)
		{
			if(Character.isLetter(k))
			{
				switch(k)
				{
					case 'a','e','i','o','u','A','E','I','O','U' -> vc++;
					default -> cc++;
				}
			}
		}
		System.out.println(vc + " " + cc);
	}
}