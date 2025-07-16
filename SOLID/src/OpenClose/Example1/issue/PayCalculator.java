package OpenClose.Example1.issue;

import SingleResponsibility.Example1.fix.Employee;

/**
 * @author: Ashraful Islam Shanto
 * <p>Date:7/16/25</p>
 * <p>Time:11:05 AM</p>
 */
public class PayCalculator {
    public double calculatePay(Employee employee) {
        if(employee instanceof Manager) {
            return employee.getSalary()*100;
        }
        else if(employee instanceof Engineer) {
            return employee.getSalary()*200;
        }else {
            return employee.getSalary();
        }
    }
}
