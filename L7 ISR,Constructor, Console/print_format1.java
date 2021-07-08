//program for print format

class print_format1
{
	public static void main(String args[])
	{
		int i = 12;
		System.out.printf("%d%n", i);		// 12		
		System.out.printf("%7d%n", i);		// _____12
		System.out.printf("%10d%n", i);		// ________12
		System.out.printf("%010d%n", i);	// 0000000012
		System.out.printf("%-10d%n", i);	// 12

		float j = 1.567f;		
		System.out.printf("%f%n", j);		// 1.567000
		System.out.printf("%.1f%n", j);		// 1.6
		System.out.printf("%.2f%n", j);		// 1.57
		System.out.printf("%.3f%n", j);		// 1.567
		System.out.printf("%8.2f%n", j);        // ____1.57
		System.out.printf("%08.2f%n", j);	// 00001.57
		System.out.printf("%-8.2f%n", j);       // 1.57
		
		String k = "girish";
		System.out.printf("%s%n", k);
		System.out.printf("%10s%n", k);
		System.out.printf("%-10s%n", k);
	}
}