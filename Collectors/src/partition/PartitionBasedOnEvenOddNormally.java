package partition;



import java.util.List;

import static java.util.stream.Collectors.toList;

/**
 * @author: Ashraful Islam Shanto
 * <p>Date:9/13/25</p>
 * <p>Time:8:23 PM</p>
 */
public class PartitionBasedOnEvenOddNormally {
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
        List<Person>people=createPeople();

        List<Person>evenAged=people.stream()
                .filter(person -> person.getAge()%2==0)
                .collect(toList());
        List<Person>oddAged=people.stream()
                .filter(person -> person.getAge()%2==1)
                .collect(toList());
        System.out.println(evenAged);
        System.out.println(oddAged);

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

