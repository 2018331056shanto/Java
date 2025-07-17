package DependencyInversion.Example1.issue;

/**
 * @author: Ashraful Islam Shanto
 * <p>Date:7/17/25</p>
 * <p>Time:2:30 PM</p>
 */
public class EmailSender {
    public void sendPromotionEmail(Employee employee){

        System.out.println("Email sending promotion email to : "+employee.getName()+" new Designation : "+employee.getDesignation() +" new Salary : "+employee.getSalary());
    }
}
