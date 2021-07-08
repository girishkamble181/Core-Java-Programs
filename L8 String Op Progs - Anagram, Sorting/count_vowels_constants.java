//wap to read a string and count the
//number of vowels and constants

import java.io.*;
class count_vowels_constants
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
				if(k=='a' || k=='e' || k=='i' || k=='o' || k=='u' || k=='A' || k=='E' || k=='I' || k=='O' || k=='U' )
					vc++;
				else
					cc++;
			}
		}
		System.out.println(vc + " " + cc);
	}
}