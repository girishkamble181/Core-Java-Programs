/*	wap to accept as input csv and print the following:
	i/p:	"a,2,b,4,c,3"
	o/p:	a	a
		b	b	b	b
		c	c	c
*/

import java.io.*;
class csv_data_print_in_format
{
	public static void main(String args[])
	{
		Console c= System.console();
		String csv= c.readLine("enter csv data ");
	
		String[] data= csv.split(",");
		
		for(int i= 0; i< data.length; i+=2)	
		{
			String kya= data[i];
			int kitna= Integer.parseInt(data[i+1]);
			for(int j=1; j<=kitna;j++)
				System.out.print(kya + "\t");
			System.out.println();
		}
	}
}