//wap to read a string and count the number of letters , digits
//and other characters


import java.io.*;
class count_letters_digits
{
	public static void main(String args[])
	{
		Console c= System.console();
		String str= c.readLine("enter a string ");
		int lc=0, dc=0, oc=0;

		for(int i=0; i < str.length(); i++)
		{
			char ch= str.charAt(i);
			if(Character.isLetter(ch))
				lc++;
			else if(Character.isDigit(ch))
				dc++;
			else
				oc++;
		}
		System.out.println(lc + " " + dc + " " + oc);
	}
}