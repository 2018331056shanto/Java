
package flatMap;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toList;

/**
 * @author: Ashraful Islam Shanto
 * <p>Date:9/28/25</p>
 * <p>Time:12:06 PM</p>
 */
public class CharactersInNameInUpperCaseGroupByAge {
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
                .collect(
                        groupingBy(Person::getAge,
                                Collectors.mapping(person->person.getName().toUpperCase(),
                                Collectors.flatMapping(name -> Stream.of(name.split("")), toList()))))
        );
    }

}
