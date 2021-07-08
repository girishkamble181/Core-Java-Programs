/*	wap to accept as input csv and print the following:
	i/p:	"a,2,b,4,c,3"
	o/p:	a	a
		b	b	b	b
		c	c	c
*/

import java.util.*;
class csv_data_print_in_format_useDelimeter
{
	public static void main(String args[])
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter csv data ");
		String csv= s.next();
	
		Scanner t= new Scanner(csv);
		t.useDelimiter(",");
		
		while(t.hasNext())	
		{
			String kya= t.next();
			int kitna= t.nextInt();
			for(int j=1; j<=kitna; j++)
				System.out.print(kya + "\t");
			System.out.println();
		}
	}
}