package OpenClose.Example1.issue;

import SingleResponsibility.Example1.fix.Employee;

/**
 * @author: Ashraful Islam Shanto
 * <p>Date:7/16/25</p>
 * <p>Time:11:09 AM</p>
 */
public class Engineer extends Employee {
    private String designation;
    public Engineer(String name,String designation) {

        super(name,10);
        this.designation = designation;
    }
}
