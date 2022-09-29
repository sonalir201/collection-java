import java.util.*;

class Employee {
    int age;
    String name;
    String designation;

    Employee(int age, String name, String designation) {
        this.age = age;
        this.name = name;
        this.designation = designation;
    }

    public String toString() {
        return "(age is->" + age + "," + "name is->" + name + "," + "desination is->" + designation + ")";
    }

}

public class Colle4 {

    public static void main(String args[]) {
        Employee e1 = new Employee(20, "Anshuman", "trainee");
        Employee e2 = new Employee(28, "Anup", "manager");
        Employee e3 = new Employee(27, "Anish", "director");
        Employee e4 = new Employee(38, "Ashish", "CEO");

        Map<Employee, Integer> map = new LinkedHashMap<>();

        map.put(e1, 150);
        map.put(e2, 2000);
        map.put(e3, 3882);
        map.put(e4, 1855232);
        for (Employee key : map.keySet()) {
            System.out.println(key + ":" + map.get(key));
        }
    }
}


