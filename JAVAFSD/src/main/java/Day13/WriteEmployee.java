package Day13;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class WriteEmployee {
    public static void main(String[] args) {
        try {
            Employee e1 = new Employee(101, "Ram", 5000);
            Employee e2 = new Employee(102, "Sam", 6000);

            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/Day13/emp.txt"));
            oos.writeObject(e1);
            oos.writeObject(e2);
            oos.close();

            System.out.println("Data written");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}