package LiskovSubstitution.Example1.fix.HandleAtHigherLevel;

/**
 * @author: Ashraful Islam Shanto
 * <p>Date:7/16/25</p>
 * <p>Time:3:45 PM</p>
 */
public class Employee implements BonusEligible {
    @Override
    public void payBonus() {
        System.out.println("Paying bonus to permanent employee");

    }

    @Override
    public void paySalary() {
        System.out.println("Paying salary to permanent employee");

    }
}
