package Day10;

public class Transactions2 {

    public static void main(String[] args) {

        try {
            Person3 p3 = new Person3("James", "Bond", 6);
            p3.display();
        } 
        catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}