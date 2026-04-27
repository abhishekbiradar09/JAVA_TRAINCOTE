package Day5;

import java.time.LocalDate;

public class PersonMain {

    public static void main(String[] args) {
        ModifyPerson p = new ModifyPerson("Divya", "Bharathi", 'F', LocalDate.of(1998, 8, 28));
        p.display();
    }
}