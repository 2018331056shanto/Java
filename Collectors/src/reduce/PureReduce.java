package reduce;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Ashraful Islam Shanto
 * <p>Date: 9/7/25</p>
 * <p>Time: 7:59 PM</p>
 */
public class PureReduce {
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

        List<String> nameOfOlderThan30 = createPeople()
                .stream()
                .filter(person -> person.getAge() > 30)
                .map(Person::getName)
                .map(String::toUpperCase)
                .reduce(new ArrayList<String>(), (names, name) -> {

                    names.add(name);
                    return names;
                }, (names1, names2) -> {

                    names1.addAll(names2);
                    return names1;
                });


        System.out.println(nameOfOlderThan30);
//                .reduce(new ArrayList<String>(),(new ArrayList<String>() x, name)->names.ad));
    }
}
