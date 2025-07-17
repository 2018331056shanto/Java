package InterfaceSegregation.Example1.fix;

/**
 * @author: Ashraful Islam Shanto
 * <p>Date:7/16/25</p>
 * <p>Time:5:39 PM</p>
 */
public class Manager implements Worker,MeetingAttendee{
    @Override
    public void attendMeeting() {
        System.out.println("Attending Meeting");
    }

    @Override
    public void work() {
        System.out.println("Working ");
    }
}
