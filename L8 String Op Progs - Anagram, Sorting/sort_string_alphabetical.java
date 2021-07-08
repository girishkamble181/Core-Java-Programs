// wap to read a string and sort it in alphabetical order
// i/p: mihir o/p: himir		i/p: girish	o/p: ghiirs

import java.io.*;
import java.util.*;
class sort_string_alphabetical
{
	public static void main(String args[])
	{
	Console c= System.console();
	String str= c.readLine("enter a string ");

	System.out.println("Original String = "+str);

	char ch[]= str.toCharArray();
	Arrays.sort(ch);
	str= new String(ch);
	
	System.out.println("Sorted string = "+str);
	}

}