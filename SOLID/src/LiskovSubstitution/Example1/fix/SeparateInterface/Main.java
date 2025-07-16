package LiskovSubstitution.Example1.fix.SeparateInterface;

/**
 * @author: Ashraful Islam Shanto
 * <p>Date:7/16/25</p>
 * <p>Time:12:59 PM</p>
 */
public class Main {
    public static void main(String[] args) {
        Payable employee = new Employee();
        Payable contract=new ContractEmployee();

        employee.paySalary();
        employee.paySalary();

        contract.paySalary();

    }
}
