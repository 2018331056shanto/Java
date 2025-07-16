package SingleResponsibility.Example1.fix;

/**
 * @author: Ashraful Islam Shanto
 * <p>Date:7/16/25</p>
 * <p>Time:10:22 AM</p>
 */
public class PayCalculator {
    public PayCalculator() {
    }

    public double calculatePay(Employee employee) {

        return employee.getSalary() * 10;
    }
}
