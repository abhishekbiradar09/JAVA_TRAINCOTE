package Day11;

import java.util.Arrays;

public class ProductSort {

    public static void main(String[] args) {

        String[] products = {"Laptop", "Mobile", "Charger", "Keyboard", "Mouse"};

        Arrays.sort(products);

        System.out.println("Sorted Products:");
        for (String p : products) {
            System.out.println(p);
        }
    }
}