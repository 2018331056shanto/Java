package group;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author: Ashraful Islam Shanto
 * <p>Date:9/14/25</p>
 * <p>Time:5:12 PM</p>
 */
public class GroupByNameAndGetCountOfNamesInIntegerFunctionalStyle {
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

        Map<String,Integer> countByName=createPeople().stream()
                .collect(Collectors.groupingBy(Person::getName,Collectors.collectingAndThen(Collectors.counting(),Long::intValue) ));

        System.out.println(countByName);
    }
}
