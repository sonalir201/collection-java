import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee {

    private String name;
    private double age;
    private double salary;

    public Employee(String name, double age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

}

public class Colle2 {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Prashant", 23, 110.0);
        Employee employee2 = new Employee("sonali", 23, 90.0);
        Employee employee3 = new Employee("Akash", 22, 900.0);
        Employee employee4 = new Employee("Saourav", 22, 120.0);
        Employee employee5 = new Employee("Puspendra", 23, 200.0);
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);
        employeeList.add(employee5);
        Collections.sort(employeeList, new Comparator<Employee>() {
            public int compare(Employee e1, Employee e2) {
                if (e1.getSalary() > e2.getSalary()) {
                    return 1;
                } else if (e1.getSalary() == e2.getSalary()) {
                    return 0;
                } else {
                    return -1;
                }
            }
        });
        System.out.println("Employess in decreasing order of salary");
        Collections.reverse(employeeList);
        for (Employee e : employeeList) {
            System.out.println(e.getName() + " " + e.getSalary());
        }
    }
}


