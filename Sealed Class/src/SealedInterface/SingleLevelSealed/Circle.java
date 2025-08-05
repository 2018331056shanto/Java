package SealedInterface.SingleLevelSealed;

/**
 * @author: Ashraful Islam Shanto
 * <p>Date:8/5/25</p>
 * <p>Time:10:21 AM</p>
 */
public non-sealed class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("Circle");
    }
}
