package map.typeOfFunction;

import java.util.List;

import static java.util.stream.Collectors.toList;

/**
 * @author: Ashraful Islam Shanto
 * <p>Date:9/28/25</p>
 * <p>Time:10:40 AM</p>
 */

public class OneToManyFunction {
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

        List<Integer> numbers=List.of(1,2,4);

        System.out.println(numbers.stream()
                .map(e->List.of(e-1,e+1)) //one-to-many function
                .collect(toList()));


    }
}