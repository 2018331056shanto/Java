package LiskovSubstitution.Example1.issue;

/**
 * @author: Ashraful Islam Shanto
 * <p>Date:7/16/25</p>
 * <p>Time:12:42 PM</p>
 */
public class ContractEmployee extends Employee {

    @Override
    public void payBonus() {

        throw new UnsupportedOperationException("Contract employee does not get bonus");
    }
}
