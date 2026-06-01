package Day15;
import java.util.HashMap;
public class EmployeeService {
	HashMap<Integer, Employee> map = new HashMap<>();

    public void addEmployee(Employee e) {
        map.put(e.id, e);
    }

    public void displayByScheme(String scheme) {
        for (Employee e : map.values()) {
            if (e.insuranceScheme.equalsIgnoreCase(scheme)) {
                System.out.println(e);
            }
        }
    }

    public boolean deleteEmployee(int id) {
        if (map.containsKey(id)) {
            map.remove(id);
            return true;
        }
        return false;
    }

    public void displayAll() {
        for (Employee e : map.values()) {
            System.out.println(e);
        }
    }
}