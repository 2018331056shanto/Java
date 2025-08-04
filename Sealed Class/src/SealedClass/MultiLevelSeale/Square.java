package SealedClass.MultiLevelSeale;

/**
 * @author: Ashraful Islam Shanto
 * <p>Date:8/4/25</p>
 * <p>Time:5:49 PM</p>
 */
public sealed class Square extends Shape permits Rectangle{

    @Override
    public void draw(){
        System.out.println("Square");
    }
    public void paint(){
        System.out.println("Paint Square");
    }
}
