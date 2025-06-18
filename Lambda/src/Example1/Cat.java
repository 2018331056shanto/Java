package Example1;

/**
 * @author: Ashraful Islam Shanto
 * <p>Date:6/18/25</p>
 * <p>Time:12:30 PM</p>
 */
public class Cat implements Printable{

    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void print() {
        System.out.println(name);
    }
}
