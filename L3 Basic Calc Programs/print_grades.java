// wap to read marks and print the grade
// m >= 80 --> A, m >= 60 --> B, m>= 40 --> C else F

class print_grades
{
	public static void main(String args[])
	{
		int m= Integer.parseInt(args[0]);
		String g="";

		if (m < 0 || m > 100)
			g= "Invalid Marks";

		else if (m >= 80)
			g= "Grade A";
		
		else if (m >= 60)
			g= "Grade B";

		else if (m >= 40)
			g= "Grade C";

		else
			g= "Grade F";
		
		System.out.println(" Marks = " + m + " Grade = " + g);



	}
}