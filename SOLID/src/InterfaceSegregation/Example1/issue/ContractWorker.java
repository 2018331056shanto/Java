package InterfaceSegregation.Example1.issue;

/**
 * @author: Ashraful Islam Shanto
 * <p>Date:7/16/25</p>
 * <p>Time:5:27 PM</p>
 */
public class ContractWorker implements  EmployeeActions{
    @Override
    public void work() {

        System.out.println("Working for contract worker");
    }

    @Override
    public void attendMeeting() {

    }

    @Override
    public void submitTimesheet() {

    }
}
