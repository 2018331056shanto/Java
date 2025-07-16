package SingleResponsibility.Example1.fix;

/**
 * @author: Ashraful Islam Shanto
 * <p>Date:7/16/25</p>
 * <p>Time:10:22 AM</p>
 */
public class Employee {
    private String name;
    private double salary;
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
