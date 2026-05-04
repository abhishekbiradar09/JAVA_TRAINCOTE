package Day11;

public class Employee {

    int id;
    String name;
    double salary;

    public Employee(int id, String name, double salary) throws EmployeeException {

        if (salary < 3000) {
            throw new EmployeeException("Salary must be >= 3000");
        }

        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void display() {
        System.out.println(id + " " + name + " " + salary);
    }
}