package SealedClass.MultiLevelSeale;

/**
 * @author: Ashraful Islam Shanto
 * <p>Date:8/4/25</p>
 * <p>Time:5:49 PM</p>
 */
public non-sealed class Circle extends Shape{
    @Override
    public  void draw(){
        System.out.println("Circle");
    }
    public void paint(){
        System.out.println("Paint Circle");
    }
}
