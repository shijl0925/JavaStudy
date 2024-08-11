import com.horstmann.corejava.Employee;
import java.util.List;
import java.util.ArrayList;

public class EmployeeTest {
    public static void main(String[] args) {
//        Employee[] staff = new Employee[3];
//        staff[0] = new Employee("Carl Cracker", 75000, 1987, 12, 15);
//        staff[1] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
//        staff[2] = new Employee("Tony Tester", 40000, 1990, 3, 15);

        List<Employee> staff = new ArrayList<>();
        Employee e1 = new Employee("Carl Cracker", 75000, 1987, 12, 15);
        staff.add(e1);

        Employee e2 = new Employee("Harry Hacker", 50000, 1989, 10, 1);
        staff.add(e2);

        Employee e3 = new Employee("Tony Tester", 40000, 1990, 3, 15);
        staff.add(e3);

        for (Employee e : staff) {
            e.raiseSalary(5);
        }

        for (Employee e : staff) {
            System.out.println("id=" + e.getId() + ",name=" + e.getName() + ",salary=" + e.getSalary() + ",hireDay="
                    + e.getHireDay());
        }

        System.out.println(staff.get(0).equals(staff.get(1)));
    }
}
