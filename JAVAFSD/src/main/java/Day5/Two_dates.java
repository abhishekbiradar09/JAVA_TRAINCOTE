package Day5;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Two_dates
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter date 1:");
		String d1=sc.nextLine();
		System.out.println("enter date 2:");
		String d2=sc.nextLine();
		
		LocalDate input1=LocalDate.parse(d1);
		LocalDate input2=LocalDate.parse(d2);
        Period diff;
		int res=input1.compareTo(input2);
		
		if(res<0)
		{
			diff=Period.between(input1, input2);
		}
		else if(res>0)
		{
			diff=Period.between(input2, input1);
		}
		else
		{
			System.out.println("Both dates are same.");
			return;
		}
		
		System.out.print(diff.getYears() +"Years " + diff.getMonths() +"Months " + diff.getDays() +"days");
	}

}