package SealedClass.MultiLevelSeale;

/**
 * @author: Ashraful Islam Shanto
 * <p>Date:8/4/25</p>
 * <p>Time:5:48 PM</p>
 */
public sealed class Shape permits Circle,Eclipse,Square {

    public  void draw(){
        System.out.println("Shape");
    }
}
