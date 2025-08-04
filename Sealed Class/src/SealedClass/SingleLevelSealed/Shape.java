package SealedClass.SingleLevelSealed;

/**
 * @author: Ashraful Islam Shanto
 * <p>Date:8/4/25</p>
 * <p>Time:5:04 PM</p>
 */
public sealed class Shape permits Eclipse,Circle,Square {

    public  void draw(){
        System.out.println("Shape");
    }
}
