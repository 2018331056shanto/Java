package group;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author: Ashraful Islam Shanto
 * <p>Date:9/14/25</p>
 * <p>Time:3:54 PM</p>
 */
public class GroupByNameFunctionalStyle {


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

        Map<String,List<Person>> groupByName=createPeople().stream()
                .collect(Collectors.groupingBy(person -> person.getName()));

        System.out.println(groupByName);
    }
}
