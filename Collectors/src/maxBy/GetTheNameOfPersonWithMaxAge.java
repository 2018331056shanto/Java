package maxBy;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author: Ashraful Islam Shanto
 * <p>Date:9/22/25</p>
 * <p>Time:5:18 PM</p>
 */
public class GetTheNameOfPersonWithMaxAge {
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

        String result = (createPeople().stream()
                .collect(Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(Person::getAge)), person -> person.map(Person::getName).orElse(null))));
        System.out.println(result);

    }
}
