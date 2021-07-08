// wap to read marks of students and
//find the lowest and highest marks
//using sort method

import java.io.*;
import java.util.*;

class sort_lowest_highest_mrks
{
	public static void main(String args[])
	{
		Console c= System.console();
		int n= Integer.parseInt(c.readLine("enter number of students "));
		int marks[]= new int[n];
		
		for(int i=0; i<marks.length; i++)
			marks[i]= Integer.parseInt(c.readLine("enter marks "));
	
		Arrays.sort(marks);
			
		int lowest = marks[0];
		int highest = marks[marks.length-1];
	
		System.out.println("lowest = "+lowest);
		System.out.println("highest = "+highest);
	}
}