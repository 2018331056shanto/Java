package InterfaceSegregation.Example1.issue;

/**
 * @author: Ashraful Islam Shanto
 * <p>Date:7/16/25</p>
 * <p>Time:5:28 PM</p>
 */
public class Main {
    public static void main(String[] args) {
        EmployeeActions worker=new ContractWorker();
        EmployeeActions manager=new Manager();

        worker.work();
        manager.attendMeeting();
    }
}
