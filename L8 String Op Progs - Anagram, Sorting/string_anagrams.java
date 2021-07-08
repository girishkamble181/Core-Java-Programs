// wap to read two strings and find if they are anagrams
// two strings having same letters but different meanings
// hear <--> earth	listen <--> silent

import java.io.*;
import java.util.*;
class string_anagrams
{
	public static void main(String args[])
	{
		Console c= System.console();
		String s1= c.readLine("enter first string ");
		String s2= c.readLine("enter second string ");

		char[] ch1= s1.toCharArray();
		Arrays.sort(ch1);
		s1= new String(ch1);

		char[] ch2= s2.toCharArray();
		Arrays.sort(ch2);
		s2= new String(ch2);

		if(s1.equals(s2))
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}