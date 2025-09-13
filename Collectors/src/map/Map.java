package map;

import java.util.List;

/**
 * @author: Ashraful Islam Shanto
 * <p>Date: 9/7/25</p>
 * <p>Time: 11:15 AM</p>
 */
public class Map {

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

        createPeople()

                .stream()
                .filter(person -> person.getAge() > 30)
                .map(Person::getName)
                .forEach(System.out::println);
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


