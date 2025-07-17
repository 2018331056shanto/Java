package InterfaceSegregation.Example1.fix;

/**
 * @author: Ashraful Islam Shanto
 * <p>Date:7/16/25</p>
 * <p>Time:5:40 PM</p>
 */
public class ContractWorker implements Worker{
    @Override
    public void work() {
        System.out.println("Working Contractual");
    }
}
