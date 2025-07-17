package DependencyInversion.Example1.fix;

/**
 * @author: Ashraful Islam Shanto
 * <p>Date:7/17/25</p>
 * <p>Time:2:46 PM</p>
 */
public class Employee {


    private String name;
    private double salary;
    private String designation;

    public Employee(String name, double salary, String designation) {
        this.name = name;
        this.salary = salary;
        this.designation = designation;
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

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void notifyPromotion(Notifier notifier){
        notifier.sendNotification(this);
    }

}
