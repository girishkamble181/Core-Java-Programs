// switch case

class month_days_switch
{
	public static void main(String args[])
	{
		String mn = args[0];
		String days= "";
		
		switch(mn)
		{
			case "jan":	 days= "31";		break;
			case "feb":	 days= "28/29";		break;
			case "mar":	 days= "31";		break;
			case "apr":	 days= "30";		break;
			case "may":	 days= "31";		break;
			case "jun":	 days= "30";		break;
			case "jul":	 days= "31";		break;
			case "aug":	 days= "31";		break;
			case "sep":	 days= "30";		break;	
			case "oct":	 days= "31";		break;
			case "nov":	 days= "30";		break;
			case "dec":	 days= "31";		break;
			default:	 days= "Invalid";
		}
			System.out.println("days in "+ mn + " = " + days + " days ");
		
		
	}
}