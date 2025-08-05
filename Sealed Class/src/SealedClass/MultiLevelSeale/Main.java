package SealedClass.MultiLevelSeale;

/**
 * @author: Ashraful Islam Shanto
 * <p>Date:8/4/25</p>
 * <p>Time:5:52 PM</p>
 */
public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();
        circle.draw();
        //Here we are not able to access paint() method with reference with Shape class
//        circle.paint();

        //We are pm;u
        Circle circle1 = new Circle();
        circle1.paint();

        Shape ellipse = new Eclipse();
        ellipse.draw();

        Shape square = new Square();
        square.draw();

        Shape rectangle = new Rectangle();
        rectangle.draw();
        //Same reason like Circle with reference Shape
//        rectangle.paint();

        Square rectangle1 = new Rectangle();
        rectangle1.draw();
        rectangle1.paint();
        Circle circle2=new Circle3d();
        circle2.draw();
        circle2.paint();
        Shape circle3=new Circle3d();
        circle3.draw();

    }
}
