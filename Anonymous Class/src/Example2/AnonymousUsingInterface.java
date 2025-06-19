package Example2;

/**
 * @author: Ashraful Islam Shanto
 * <p>Date:6/19/25</p>
 * <p>Time:1:10 PM</p>
 */
public class AnonymousUsingInterface {

    public static void main(String[] args) {

        Runnable runnableImplement = new RunnableImplement();
        runnableImplement.run();
//
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello World");
            }
        };
        runnable.run();
    }
}
