package LiskovSubstitution.Example1.fix.HandleAtHigherLevel;

/**
 * @author: Ashraful Islam Shanto
 * <p>Date:7/16/25</p>
 * <p>Time:3:56 PM</p>
 */
public class BonusProcessor {
    public void bonusProcessor(Payable employee) {
        employee.paySalary();
        if (employee instanceof BonusEligible) {
            ((BonusEligible) employee).payBonus();
        }
    }
}
