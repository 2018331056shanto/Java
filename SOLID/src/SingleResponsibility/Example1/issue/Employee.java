package SingleResponsibility.Example1.issue;

/**
 * @author: Ashraful Islam Shanto
 * <p>Date:7/16/25</p>
 * <p>Time:10:05 AM</p>
 */
public class Employee {
    private String name;
    private double salary;
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    public double calculateSalary() {

        System.out.println("Calculating salary...");
        return salary*10;
    }
    public void saveToDatabase(String name) {

        System.out.println("Employee " + name + " has been saved to database");
    }
    public void generateReport(){
        System.out.println("Employee " + name + " has been generated");
    }
}
