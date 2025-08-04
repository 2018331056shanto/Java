package SealedClass.SingleLevelSealed;

/**
 * @author: Ashraful Islam Shanto
 * <p>Date:8/4/25</p>
 * <p>Time:5:08 PM</p>
 */
public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();
        circle.draw();
        Shape eclipse=new Eclipse();
        eclipse.draw();
        Rectangle rect=new Rectangle();
        rect.draw();
    }
}
