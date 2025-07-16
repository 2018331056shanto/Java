package OpenClose.Example1.issue;

import SingleResponsibility.Example1.fix.Employee;

/**
 * @author: Ashraful Islam Shanto
 * <p>Date:7/16/25</p>
 * <p>Time:11:10 AM</p>
 */
public class Main {
    public static void main(String[] args) {
        Employee manager=new Manager("Shanto","Manager");
        Employee engineer=new Engineer("Saiful","Engineer");
        PayCalculator payCalculator=new PayCalculator();

        System.out.println(payCalculator.calculatePay(manager));
        System.out.println(payCalculator.calculatePay(engineer));
    }
}
