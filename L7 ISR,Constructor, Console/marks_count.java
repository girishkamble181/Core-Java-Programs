//wap count m > 8, m > 5 and rem

import java.io.*;

class marks_count
{
	public static void main(String args[])
	{
		Console c= System.console();
		int n = Integer.parseInt(c.readLine(" enter number of students "));
		
		if (n > 0)
		{
			int marks[]= new int[n];
		
			for(int i=0; i<n; i++)
				marks[i] = Integer.parseInt(c.readLine("enter marks "));
			
			int c1= 0, c2= 0, c3=0;
			for(int k: marks)
			{
				if (k > 8)		c1++;
				else if (k > 5)		c2++;
				else			c3++;
			}
			System.out.println(c1 + " " + c2 + " " + c3);	
		}
		else
		{
			System.out.println("number of students shuld be atleast 1");
		}
	}
}