package SealedInterface.SingleLevelSealed;

/**
 * @author: Ashraful Islam Shanto
 * <p>Date:8/5/25</p>
 * <p>Time:10:29 AM</p>
 */
public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();
        circle.draw();
        Shape square = new Square();
        square.draw();
        Shape rectangle = new Rectangle();
        rectangle.draw();
    }
}
