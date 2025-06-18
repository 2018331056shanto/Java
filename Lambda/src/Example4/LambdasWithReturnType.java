package Example4;

/**
 * @author: Ashraful Islam Shanto
 *  <p>Date:6/18/25</p>
 * <p>Time:3:21 PM</p>
 */
public class LambdasWithReturnType {
    public static void main(String[] args) {

        printThing(((suffix, prefix) -> suffix + prefix));

    }

    static void printThing(Printable printable){

        printable.print("Shanto","Peuly");

    }
}
