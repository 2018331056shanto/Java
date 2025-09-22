package reduce.max;


import java.util.List;

/**
 * @author: Ashraful Islam Shanto
 * <p>Date:9/22/25</p>
 * <p>Time:4:21 PM</p>
 */
public class TotalAgeSumUsingSum {
    public static List<Person> createPeople() {
        return List.of(

                new Person("Sara", 20),
                new Person("Sara", 22),
                new Person("Bob", 20),
                new Person("Paula", 32),
                new Person("Paul", 32),
                new Person("Jack", 3),
                new Person("Jack", 72),
                new Person("Jill", 11)
        );

    }

    public static void main(String[] args) {

        System.out.println(createPeople().stream()
                .mapToInt(Person::getAge)
                .sum());

    }
}


