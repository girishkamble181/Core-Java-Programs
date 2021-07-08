// wap to read  an integer and find if its even or odd

import java.io.*;
class even_odd_isr_br
{
	public static void main(String args[]) throws IOException
	{
		InputStreamReader isr= new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.println("enter an integer");
		int num = Integer.parseInt(br.readLine());
		
		if (num % 2 == 0)
			System.out.println("Even");
		else
			System.out.println("Odd");
	}
}