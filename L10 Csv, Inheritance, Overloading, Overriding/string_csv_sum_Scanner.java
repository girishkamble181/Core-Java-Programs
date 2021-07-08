// wap to read a csv string and add all the integers
// i/p: "10,30,20,5,7"	o/p: 72
// using Scanner

import java.util.*;
class string_csv_sum_Scanner
{
	public static void main(String args[])
	{
		Scanner s= new Scanner(System.in);
		System.out.println("enter csv data ");
		String csv= s.next();
		
		Scanner t= new Scanner(csv);
		t.useDelimiter(",");			// if useDelimiter not used then it will consider space and split it
	
		int sum=0;
		while(t.hasNext())
			sum = sum + t.nextInt();	// for integer -->nextInt();
		
		System.out.println("sum = "+sum);

	}
}

//adv:
// jab mangoge tab milega
// jaise mangoge waisa milega
		