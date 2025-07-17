package InterfaceSegregation.Example1.issue;

/**
 * @author: Ashraful Islam Shanto
 * <p>Date:7/16/25</p>
 * <p>Time:5:26 PM</p>
 */
public class Manager implements  EmployeeActions {
    @Override
    public void work() {

    }

    @Override
    public void attendMeeting() {
        System.out.println("Attend meeting Manager");
    }

    @Override
    public void submitTimesheet() {

    }
}
