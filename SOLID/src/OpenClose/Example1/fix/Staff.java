package OpenClose.Example1.fix;

import SingleResponsibility.Example1.fix.Employee;

/**
 * @author: Ashraful Islam Shanto
 * <p>Date:7/16/25</p>
 * <p>Time:11:36 AM</p>
 */
public class Staff extends Employee implements Payable{
    private String designation;
    public Staff(String name,String designation) {
        super(name,10);
        this.designation=designation;
    }
    @Override
    public double calculatePay() {
        return this.getSalary()*50;
    }
}
