package Day15;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        EmployeeService service = new EmployeeService();

        service.addEmployee(new Employee(101, "Ram", 5000, "Manager", "SchemeA"));
        service.addEmployee(new Employee(102, "Sam", 3000, "Clerk", "SchemeB"));
        service.addEmployee(new Employee(103, "John", 7000, "Manager", "SchemeA"));

        int choice;

        do {
            System.out.println("\n1.Add 2.Display by Scheme 3.Delete 4.Display All 5.Exit");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter id name salary designation scheme: ");
                    int id = sc.nextInt();
                    String name = sc.next();
                    double sal = sc.nextDouble();
                    String des = sc.next();
                    String scheme = sc.next();

                    service.addEmployee(new Employee(id, name, sal, des, scheme));
                    break;

                case 2:
                    System.out.print("Enter scheme: ");
                    String s = sc.next();
                    service.displayByScheme(s);
                    break;

                case 3:
                    System.out.print("Enter id: ");
                    int did = sc.nextInt();
                    if (service.deleteEmployee(did))
                        System.out.println("Deleted");
                    else
                        System.out.println("Not Found");
                    break;

                case 4:
                    service.displayAll();
                    break;
            }

        } while (choice != 5);

        sc.close();
    }
}