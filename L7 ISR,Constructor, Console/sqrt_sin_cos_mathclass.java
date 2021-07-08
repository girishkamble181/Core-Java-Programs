//wap to find square root (sin(a) + cos(b))
// Math class --> sin(), cos(), sqrt()

import java.io.*;
class sqrt_sin_cos_mathclass
{
	public static void main(String args[]) throws IOException
	{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
	System.out.println("enter value of a ");
	double a= Double.parseDouble(br.readLine());
	System.out.println("enter value of b ");
	double b= Double.parseDouble(br.readLine());
	
	double a1= Math.sin(a);
	double a2= Math.cos(b);
	double res= Math.sqrt(a1 + a2);
	System.out.println("res = "+res);
	System.out.printf("res = %.2f%n ",res);
	
	}	
}