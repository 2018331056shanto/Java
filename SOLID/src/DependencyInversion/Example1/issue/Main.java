package DependencyInversion.Example1.issue;

/**
 * @author: Ashraful Islam Shanto
 * <p>Date:7/17/25</p>
 * <p>Time:2:33 PM</p>
 */
public class Main {
    public static void main(String[] args) {
        EmailSender emailSender = new EmailSender();
        Employee employee = new Employee("Shanto",10000,"Manager");
        employee.notificationPromotion(emailSender);
    }
}
