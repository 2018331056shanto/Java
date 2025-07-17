package DependencyInversion.Example1.fix;

/**
 * @author: Ashraful Islam Shanto
 * <p>Date:7/17/25</p>
 * <p>Time:2:47 PM</p>
 */
public class EmailSender implements Notifier{
    @Override
    public void sendNotification(Employee employee) {
        System.out.println("Send Email notification to : "+employee.getName() +" new Designation : "+employee.getDesignation()+" new Salary : "+employee.getSalary());
    }
}
