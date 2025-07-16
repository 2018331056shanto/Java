package OpenClose.Example1.issue;

import SingleResponsibility.Example1.fix.Employee;

/**
 * @author: Ashraful Islam Shanto
 * <p>Date:7/16/25</p>
 * <p>Time:11:05 AM</p>
 */
public class Manager extends Employee {

    private String designation;

    public Manager(String name,String designation) {
        super(name, 10);
        this.designation = designation;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
}
