package filtering;


import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author: Ashraful Islam Shanto
 * <p>Date:9/14/25</p>
 * <p>Time:5:01 PM</p>
 */
public class GroupByNameAndGetEvenAgesFunctionalStyle {
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

        Map<String,List<Integer>> evenAgeByName=createPeople().stream()
                .collect(Collectors.groupingBy(Person::getName,Collectors.filtering(person -> person.getAge()%2==0,Collectors.mapping(Person::getAge,Collectors.toList()))));
        System.out.println(evenAgeByName);
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