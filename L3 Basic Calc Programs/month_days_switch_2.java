// switch case using arrow operator

class month_days_switch_2
{
	public static void main(String args[])
	{
		String mn = args[0];
		String days= "";
		
		switch(mn)
		{
			case "jan","mar","may","jul","aug","oct","dec"	  -> days = "31";
			case "feb"					  -> days = "28/29";		
			case "apr","jun","sep","nov"			  -> days = "30";
			default 					  -> days = "Invalid";
		}
			System.out.println("days in "+ mn + " = " + days + " days ");
		
		
	}
}