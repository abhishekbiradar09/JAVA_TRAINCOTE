package Day13;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ReadEmployee {
    public static void main(String[] args) {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src/Day13/emp.txt"));

            Employee e1 = (Employee) ois.readObject();
            Employee e2 = (Employee) ois.readObject();

            System.out.println(e1.getId()+" "+e1.getName()+" "+e1.getSalary());
            System.out.println(e2.getId()+" "+e2.getName()+" "+e2.getSalary());

            ois.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}