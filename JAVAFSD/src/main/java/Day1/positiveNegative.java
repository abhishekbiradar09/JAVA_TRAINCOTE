package Day1;

public class positiveNegative {
	public static void main(String[] args)
	{
		if (args.length == 0) {
            System.out.println("Please provide a number as an argument.");
            return;
        }
		
		int num = Integer.parseInt(args[0]);
		if (num>0) {
			System.out.println("Positive Number");
		}
		else if(num<0) {
			System.out.println("Negative Number");
		}
		else {
			System.out.println("Zero");
		}
	}
}