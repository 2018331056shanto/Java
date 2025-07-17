package DependencyInversion.Example1.issue;

/**
 * @author: Ashraful Islam Shanto
 * <p>Date:7/17/25</p>
 * <p>Time:2:51 PM</p>
 */
public class SMSSender {
    public void sendPromotionSMS(Employee employee){

        System.out.println("SMS sending promotion email to : "+employee.getName()+" new Designation : "+employee.getDesignation() +" new Salary : "+employee.getSalary());
    }
}
