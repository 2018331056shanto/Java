package InterfaceSegregation.Example1.fix;

/**
 * @author: Ashraful Islam Shanto
 * <p>Date:7/17/25</p>
 * <p>Time:11:36 AM</p>
 */
public class Main {
    public static void main(String[] args) {
        Manager manager=new Manager();
        manager.attendMeeting();
        manager.work();

        ContractWorker contractWorker=new ContractWorker();
        contractWorker.work();
    }
}
