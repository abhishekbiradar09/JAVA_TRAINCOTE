package Day14;

import java.util.ArrayList;

public class EmployeeList {

    public static void main(String[] args) {

        ArrayList<Employee> list = new ArrayList<>();

        list.add(new Employee(101, "Ram", 5100));
        list.add(new Employee(102, "Sam", 7600));
        list.add(new Employee(103, "John",6500));

        for (Employee e : list) {
            System.out.println(e);
        }
    }
}