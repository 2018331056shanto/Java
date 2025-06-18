package Example3;

/**
 * @author: Ashraful Islam Shanto
 * <p>Date:6/18/25</p>
 * <p>Time:3:19 PM</p>
 */
public class LambdasWithMultipleParameters {
    public static void main(String[] args) {
        printThing((s,p)->{
            System.out.println(s);
            System.out.println(p);
        });

    }

    static void printThing(Printable printable) {
        printable.print("hello","world");

    }

}
