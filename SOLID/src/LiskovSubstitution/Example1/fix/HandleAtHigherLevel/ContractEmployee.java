package LiskovSubstitution.Example1.fix.HandleAtHigherLevel;

/**
 * @author: Ashraful Islam Shanto
 *  <p>Date:7/16/25</p>
 * <p>Time:3:47 PM</p>
 */
public class ContractEmployee implements Payable{
    @Override
    public void paySalary() {

        System.out.println("Paying salary to contractual employee");

    }
}
