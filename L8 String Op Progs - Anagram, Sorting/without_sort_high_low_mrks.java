// wap to read marks of students and
//find the lowest and highest marks
//without using sort method

import java.io.*;
import java.util.*;

class without_sort_high_low_mrks
{
	public static void main(String args[])
	{
		Console c= System.console();
		int n= Integer.parseInt(c.readLine("enter number of students "));
		int marks[]= new int[n];
		
		for(int i=0; i<marks.length; i++)
			marks[i]= Integer.parseInt(c.readLine("enter marks "));
	
		
			
		int lowest = marks[0];
		int highest = marks[0];

		for(int k : marks)
		{
			if(k < lowest) lowest = k;	
			if(k > highest) highest= k;
		}
		
		System.out.println("lowest = "+lowest);
		System.out.println("highest = "+highest);
	}
}