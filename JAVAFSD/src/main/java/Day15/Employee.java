package Day15;

public class Employee {
    int id;
    String name;
    double salary;
    String designation;
    String insuranceScheme;

    public Employee(int id, String name, double salary, String designation, String insuranceScheme) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.designation = designation;
        this.insuranceScheme = insuranceScheme;
    }

    public String toString() {
        return id + " " + name + " " + salary + " " + designation + " " + insuranceScheme;
    }
}