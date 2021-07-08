// wap to read month name(first 3 letters ) and print the month days
// jan --> 31 days,  feb --> 28/29 days, mar --> 31 days

class month_days
{
	public static void main(String args[])
	{
		String mn = args[0];
		String days= "";
		
		if (mn.equals("jan"))	 days= "31";
		else if (mn.equals("feb"))	 days= "28/29";
		else if (mn.equals("mar"))	 days= "31";
		else if (mn.equals("apr"))	 days= "30";
		else if (mn.equals("may"))	 days= "31";
		else if (mn.equals("jun"))	 days= "30";
		else if (mn.equals("jul"))	 days= "31";
		else if (mn.equals("aug"))	 days= "31";
		else if (mn.equals("sep"))	 days= "30";
		else if (mn.equals("oct"))	 days= "31";
		else if (mn.equals("nov"))	 days= "30";
		else if (mn.equals("dec"))	 days= "31";
		else			 days= "Invalid";
		System.out.println("days in "+ mn + " = " + days + " days ");
	}
}