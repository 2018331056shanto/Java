package SealedClass.SingleLevelSealed;

/**
 * @author: Ashraful Islam Shanto
 * <p>Date:8/4/25</p>
 * <p>Time:5:05 PM</p>
 */
public non-sealed class Circle extends Shape{
    @Override
    public void draw(){
        System.out.println("Circle");
    }
}
