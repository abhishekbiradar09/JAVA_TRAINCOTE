package Day5;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Date_Duration {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter date:");
		String d=sc.nextLine();
		LocalDate input=LocalDate.parse(d);
		LocalDate today=LocalDate.now();
		
		Period dif=Period.between(input, today);
		System.out.println("Duration:");
		System.out.print(dif.getYears() +"Years " + dif.getMonths() +"Months " + dif.getDays() +"days");
	}

}