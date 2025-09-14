package group;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author: Ashraful Islam Shanto
 * <p>Date:9/14/25</p>
 * <p>Time:3:44 PM</p>
 */
public class GroupByNameImperativeStyle {


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
        Map<String,List<Person>> groupByName=new HashMap<>();

        for(Person person:createPeople()){
            List<Person> list=null;
            if(groupByName.containsKey(person.getName())){

                list=groupByName.get(person.getName());
            }else{
                list=new ArrayList<>();
                groupByName.put(person.getName(),list);
            }

            list.add(person);
        }

        System.out.println(groupByName);
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

