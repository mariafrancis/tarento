
/*
Maria Francis
1. Write a Java program to print the day of the week after 5 days of a given date without using the calendar class.
(For example, it was a monday on 27-07-2020. So the output should be Saturday)
*/

import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		int month,year,day;
		System.out.println("month:");
		month=sc.nextInt();
		System.out.println("day:");
		day=sc.nextInt();
		System.out.println("year:");
		year=sc.nextInt();
		sc.close();
		double m;
		int y,dow;
		m=(month-2+12)%12;
		if(month<=2)
		{
			year--;
		}
		y=5*(year%4)+4*(year%100)+6*(year%400);
		dow=(day+(int)(2.6*m-0.2)+y)%7;
		switch (dow)
		{
			case 0:System.out.println("friday");
					break;
			case 1:System.out.println("saturday");
					break;
			case 2:System.out.println("sunday");
					break;
			case 3:System.out.println("monday");
					break;
			case 4:System.out.println("tuesday");
					break;
			case 5:System.out.println("wednesday");
					break;
			case 6:System.out.println("monday");
					break;
			default:System.out.println("invalid");
					break;
					
					
		}
		//System.out.println("day of week"+dow);
		
	}
}