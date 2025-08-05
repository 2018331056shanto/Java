package SealedInterface.SingleLevelSealed;

/**
 * @author: Ashraful Islam Shanto
 * <p>Date:8/5/25</p>
 * <p>Time:10:20 AM</p>
 */
public sealed interface Shape permits Circle,Rectangle,Square,DetailedShape {

    void draw();
}
