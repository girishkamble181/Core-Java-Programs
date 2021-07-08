// wap to read two strings and find if they are anagrams
// two strings having same letters but different meanings
// hear <--> earth	listen <--> silent
// using mysort function

import java.io.*;
import java.util.*;
class anagram_using_mysortfunction
{
	public static String mySort(String s)
	{	
		char ch[]= s.toCharArray();
		Arrays.sort(ch);
		s= new String(ch);
		return s;
	}

	public static void main(String args[])
	{
		Console c= System.console();
		String s1= c.readLine("enter first string ");
		String s2= c.readLine("enter second string ");

		if(mySort(s1).equals(mySort(s2)))
			System.out.println("yes");
		else
			System.out.println("no");
	}
}
