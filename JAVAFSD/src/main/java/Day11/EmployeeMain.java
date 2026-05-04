package Day11;

public class EmployeeMain {

    public static void main(String[] args) {

        try {
            Employee e = new Employee(101, "Ram", 2000);
            e.display();
        } 
        catch (EmployeeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}