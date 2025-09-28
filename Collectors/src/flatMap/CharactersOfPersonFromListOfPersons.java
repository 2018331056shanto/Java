package flatMap;

import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/**
 * @author: Ashraful Islam Shanto
 * <p>Date:9/28/25</p>
 * <p>Time:12:00 PM</p>
 */
public class CharactersOfPersonFromListOfPersons {
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
                .map(Person::getName)
                .flatMap(name -> Stream.of(name.split("")))
                .collect(toList()));
    }

}

class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String toString() {

        return "Name : " + this.name + " Age: " + this.age;
    }
}
