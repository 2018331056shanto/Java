package OpenClose.Example1.fix;

/**
 * @author: Ashraful Islam Shanto
 * <p>Date:7/16/25</p>
 * <p>Time:11:35 AM</p>
 */
public class Main {
    public static void main(String[] args) {
        Payable manager=new Manager("Shanto","Manager");
        Payable engineer=new  Engineer("Saiful","Engineer");
        Payable staff=new Staff("Mahid","Staff");

        PayCalculator payCalculator=new PayCalculator();
        System.out.println(payCalculator.calculatePay(manager));
        System.out.println(payCalculator.calculatePay(engineer));
        System.out.println(payCalculator.calculatePay(staff));
    }
}
