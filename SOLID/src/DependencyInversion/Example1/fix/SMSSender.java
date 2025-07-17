package DependencyInversion.Example1.fix;

/**
 * @author: Ashraful Islam Shanto
 * <p>Date:7/17/25</p>
 * <p>Time:2:48 PM</p>
 */
public class SMSSender implements Notifier{
    @Override
    public void sendNotification(Employee employee) {

        System.out.println("Send SMS notification to : "+employee.getName() +" new Designation : "+employee.getDesignation()+" new Salary : "+employee.getSalary());
    }
}
