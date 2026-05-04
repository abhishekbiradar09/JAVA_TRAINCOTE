package Day12;

import java.io.File;
import java.util.Scanner;

public class EvenNumbers {

    public static void main(String[] args) {

        try {
            File file = new File("src/Day12/numbers.txt");

            Scanner sc = new Scanner(file);
            sc.useDelimiter(",");

            System.out.println("Even numbers:");

            while (sc.hasNext()) {
                int num = sc.nextInt();

                if (num % 2 == 0) {
                    System.out.println(num);
                }
            }

            sc.close();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}