package filtering;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author: Ashraful Islam Shanto
 * <p>Date:9/22/25</p>
 * <p>Time:5:41 PM</p>
 */
public class GetNameOfPersonWhereNameLengthGreaterThanFour {
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

        Map<String,List<String>> getName=createPeople().stream()
                .collect(Collectors.groupingBy(Person::getName,Collectors.mapping(Person::getName,Collectors.filtering(name->name.length()>4,Collectors.toList()))));
        System.out.println(getName);

        String s="1.3.4.55.66.111";

        List<String>x= Arrays.stream(s.split("\\.")).toList();
        for(String y:x){
            System.out.println(y);
        }

        x.add("h");
//        x.length
    }
}
