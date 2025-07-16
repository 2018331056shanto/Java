package LiskovSubstitution.Example1.fix.HandleAtHigherLevel;

/**
 * @author: Ashraful Islam Shanto
 * <p>Date:7/16/25</p>
 * <p>Time:3:57 PM</p>
 */
public class Main {
    public static void main(String[] args) {
        Payable employee=new Employee();
        Payable contractualEmployee=new ContractEmployee();
        new BonusProcessor().bonusProcessor(employee);
        new BonusProcessor().bonusProcessor(contractualEmployee);
    }
}
