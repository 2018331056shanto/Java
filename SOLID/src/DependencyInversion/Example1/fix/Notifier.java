package DependencyInversion.Example1.fix;

/**
 * @author: Ashraful Islam Shanto
 * <p>Date:7/17/25</p>
 * <p>Time:2:46 PM</p>
 */
@FunctionalInterface
public interface Notifier {

    void sendNotification(Employee employee);
}
