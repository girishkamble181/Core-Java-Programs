// program using array

import java.io.*;
class marks_avg_array
{
	public static void main(String args[])
	{
		Console c = System.console();
		int n = Integer.parseInt(c.readLine("enter number of students "));
		
		if (n > 0)
		{
			int marks[]= new int[n];		//array --> group of elements of same data type
		
			for(int i=0; i<n; i++)
				marks[i]= Integer.parseInt(c.readLine("enter marks "));

			int sum= 0;
			for (int k: marks)
				sum= sum + k;
			double avg= (double) sum / n;
			System.out.printf("avg = %.2f%n", avg);
		}
		else
		{
			System.out.println("number of students shuld be atleast 1");
		}
	}
}