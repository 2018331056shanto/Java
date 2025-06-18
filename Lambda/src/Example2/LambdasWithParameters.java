package Example2;


/**
 * @author: Ashraful Islam Shanto
 * <p>Date:6/18/25</p>
 * <p>Time:3:05 PM</p>
 */
public class LambdasWithParameters {
    public static void main(String[] args) {

      printThing(((suffix) ->System.out.println(suffix)));

    }

    static void printThing(Printable printable) {
        printable.print("!");
    }

}
