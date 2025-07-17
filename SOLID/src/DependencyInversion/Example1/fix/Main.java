package DependencyInversion.Example1.fix;

/**
 * @author: Ashraful Islam Shanto
 * <p>Date:7/17/25</p>
 * <p>Time:2:52 PM</p>
 */
public class Main {
    public static void main(String[] args) {
        Employee employee=new Employee("Shanto",10000,"Manager");
        employee.notifyPromotion(new EmailSender());
        employee.notifyPromotion(new SMSSender());
        employee.notifyPromotion((employee1 -> System.out.println(employee1.getDesignation())));
    }
}
