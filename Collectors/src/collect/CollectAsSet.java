package collect;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author: Ashraful Islam Shanto
 * <p>Date: 9/7/25</p>
 * <p>Time: 10:03 PM</p>
 */
public class CollectAsSet {
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

        Set<String> nameOfOlderThan30 = createPeople()
                .stream()
                .filter(person -> person.getAge() > 30)
                .map(Person::getName)
                .map(String::toUpperCase)
                .collect(Collectors.toSet());

        System.out.println(nameOfOlderThan30);
//                .reduce(new ArrayList<String>(),(new ArrayList<String>() x, name)->names.ad));
    }
}
