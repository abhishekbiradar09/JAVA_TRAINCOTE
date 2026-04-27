package Day5;

import java.time.LocalDate;
import java.util.Scanner;

public class Warrantee_period {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter purchase date:");
		String date=sc.nextLine();
		
		System.out.println("Enter no of warrantee years:");
		int years=sc.nextInt();
		
		System.out.println("Enter no of warrantee months:");
		int months=sc.nextInt();
		
		LocalDate purchase=LocalDate.parse(date);
		LocalDate expiry=purchase.plusYears(years).plusMonths(months);
		System.out.println("Warrentee expiry date:" + expiry);
	}

}