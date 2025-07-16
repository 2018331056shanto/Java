package LiskovSubstitution.Example1.fix.SeparateInterface;

/**
 * @author: Ashraful Islam Shanto
 * <p>Date:7/16/25</p>
 * <p>Time:12:58 PM</p>
 */
public class ContractEmployee implements Payable {
    @Override
    public void paySalary() {
        System.out.println("Paying Salary");
    }
}
