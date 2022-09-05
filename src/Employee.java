import java.util.Objects;
import java.util.Set;

public class Employee implements Comparable<Employee>{
    private String name;
    private int salary;
    private int employeeCode;

    public Employee(String name, int salary, int employeeCode) {
        this.name = name;
        this.salary = salary;
        this.employeeCode = employeeCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(int employeeCode) {
        this.employeeCode = employeeCode;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", employeeCode=" + employeeCode +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return salary == employee.salary && employeeCode == employee.employeeCode && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, salary, employeeCode);
    }

    @Override
    public int compareTo(Employee employee) {
        return this.salary-employee.salary;
    }
}
