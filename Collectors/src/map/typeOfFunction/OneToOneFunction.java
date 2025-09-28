package map.typeOfFunction;

import java.util.List;

import static java.util.stream.Collectors.toList;

/**
 * @author: Ashraful Islam Shanto
 * <p>Date:9/28/25</p>
 * <p>Time:10:38 AM</p>
 */
public class OneToOneFunction {
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
                .map(e->e*2) //one-to-one function
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