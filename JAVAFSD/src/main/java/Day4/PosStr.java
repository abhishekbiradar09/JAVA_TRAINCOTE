package Day4;
import java.util.Scanner;
public class PosStr 
{
	    static boolean isPositive(String s) 
	   {
	        for (int i = 0; i < s.length() - 1; i++) 
	        {
	            if (s.charAt(i) > s.charAt(i + 1)) 
	            {
	                return false;
	            }
	        }
	        return true;
	    }
	    
	    public static void main(String[] args) 
	    {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter a string:");
	        String s = sc.nextLine();

	        if (isPositive(s)) 
	        {
	            System.out.println("Positive string");
	        } else {
	            System.out.println("Not a positive string");
	        }
	    }
}