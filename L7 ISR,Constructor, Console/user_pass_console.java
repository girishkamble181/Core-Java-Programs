//wap to read user and password. if username is girish and
// password is kamble than o/p: success else failure
//using console class to hide password typed

import java.io.*;

class user_pass_console
{
	public static void main(String args[])
	{
		Console c= System.console();
		
		System.out.println("enter username ");
		String username = c.readLine();
		
		System.out.println("enter password ");
		char[] password = c.readPassword();

		if ( (username.equals("girish")) && (new String(password).equals("kamble")) )
			System.out.println("success");
		else
			System.out.println("Failure");		
	}
}


// readLine()		echo ur input	--> returns String
// readPassword()	non- echo	--> returns char[]
// java 6 (introduced)