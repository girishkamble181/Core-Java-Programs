//wap to read user and password. if username is girish and
// password is kamble than o/p: success else failure

import java.io.*;

class username_password_isr_br
{
	public static void main(String args[]) throws IOException
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		System.out.println("Enter Username");
		String username = br.readLine();
		
		System.out.println("Enter Password");
		String password = br.readLine();

		if ( username.equals("girish") && (password.equals("kamble")) )
			System.out.println("Success");
		else
			System.out.println("Failure");
	}
}