package SealedClass.MultiLevelSeale;

/**
 * @author: Ashraful Islam Shanto
 * <p>Date:8/4/25</p>
 * <p>Time:5:50 PM</p>
 */
public final class Rectangle extends Square{
    @Override
    public void draw(){
        System.out.println("Draw Rectangle");
    }
    @Override
    public void paint(){
        System.out.println("Paint Rectangle");
    }
}
