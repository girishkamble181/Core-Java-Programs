// wap to read a csv string and add all the integers
// i/p: "10,30,20,5,7"	o/p: 72

import java.io.*;
class csv_data_sum
{
	public static void main(String args[])
	{
		Console c= System.console();
		String csv= c.readLine("enter csv data ");
		String[] data = csv.split(",");

		int sum = 0;
		for(String d: data)
			sum = sum + Integer.parseInt(d);
		System.out.println("Sum = "+sum);
	}
}

// drawbacks of split method
// it will split the entire data
// it will always return string