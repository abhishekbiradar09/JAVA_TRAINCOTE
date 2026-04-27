package Day4;
import java.util.Scanner;
public class StringOperations 
{
    static String op(String s, int c) 
    {
        if (c == 1) 
        {
            System.out.println("Adding string to itself:");
            return s + s;
        }
        else if (c == 2) 
        {
            System.out.println("Replacing odd positions with #:");
            char[] a = s.toCharArray();
            for (int i = 0; i < a.length; i++) 
            {
                if (i % 2 != 0)
                    a[i] = '#';
            }
            return new String(a);
        }
        else if (c == 3) 
        {
            System.out.println("Removing duplicate characters:");
            String r = "";
            for (int i = 0; i < s.length(); i++) 
            {
                char ch = s.charAt(i);
                if (r.indexOf(ch) == -1)
                    r += ch;
            }
            return r;
        }
        else if (c == 4) 
        {
            System.out.println("Changing odd positions to uppercase:");
            char[] a = s.toCharArray();
            for (int i = 0; i < a.length; i++) 
            {
                if (i % 2 != 0)
                    a[i] = Character.toUpperCase(a[i]);
            }
            return new String(a);
        }
        return s;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = sc.nextLine();
        System.out.println("Choose operation:");
        System.out.println("1.Add string to itself");
        System.out.println("2.Replace odd positions with #");
        System.out.println("3.Remove duplicate characters");
        System.out.println("4.Change odd positions to uppercase");
        int c = sc.nextInt();
        String res = op(s, c);
        System.out.println("Result:" + res);
    }
}