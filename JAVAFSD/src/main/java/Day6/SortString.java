package Day6;

import java.util.Arrays;

public class SortString 
{
	public static void main(String args[]) 
	{
		String[] products = {"Laptop", "Mobile", "Charger", "Headphones", "Keyboard"};

        Arrays.sort(products);

        System.out.println("Sorted Product Names:");
        
        for (String p : products) 
        {
            System.out.println(p);
        }
	}
	

}