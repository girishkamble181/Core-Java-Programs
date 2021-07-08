// wap to read a ssv string and add all the numbers
// i/p : "10 30 20 40 600"	o/p: 700

import java.io.*;
class ssv_string_add_numbers
{
	public static void main(String args[])
	{
		Console c = System.console();
		String str = c.readLine("enter ssv string ");
		// str --> " 10 30 20 40 600"

		String data[] = str.split(" ");
		// data = ["10","30","20","40","600"]  --> Tokenizing --> break data in small pieces

		int sum = 0;
		for(String d : data)
			sum = sum + Integer.parseInt(d);
		System.out.println("sum = "+sum);
	}
}