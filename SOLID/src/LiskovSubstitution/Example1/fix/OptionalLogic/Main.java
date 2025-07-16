package LiskovSubstitution.Example1.fix.OptionalLogic;

/**
 * @author: Ashraful Islam Shanto
 * <p>Date:7/16/25</p>
 * <p>Time:12:45 PM</p>
 */
public class Main {
    public static void main(String[] args) {
        Employee employee=new ContractEmployee();
        employee.paySalary();
        employee.payBonus();
    }
}
