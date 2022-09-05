import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class EmployeeMain {
    public static void main(String[] args) {
        Set<Employee> employees=new TreeSet<>();
        employees.add(new Employee("Priyanka",50000,123));
        employees.add(new Employee("Ramesh",20000,345));
        employees.add(new Employee("Suresh",34000,987));
        employees.add(new Employee("Priya",5000,789));
        employees.add(new Employee("Ravi",14000,457));

        for (Employee element: employees){
            System.out.println(element);
        }
        System.out.println();

        TreeSet<Employee> employeeTreeSet=new TreeSet<>();
        employeeTreeSet.addAll(employees);
        for (Employee employee:employeeTreeSet){
            System.out.println( employee);
        }
        System.out.println();

        ArrayList<Employee> temp=new ArrayList<>();
        temp.add(new Employee("Priya",5000,789));
        employeeTreeSet.removeAll(temp);

        for (Employee employee:employeeTreeSet){
            System.out.println( employee);
        }


    }

}
