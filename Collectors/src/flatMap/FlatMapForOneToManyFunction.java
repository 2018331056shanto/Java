package flatMap;

import java.util.List;

import static java.util.stream.Collectors.toList;

/**
 * @author: Ashraful Islam Shanto
 * <p>Date:9/28/25</p>
 * <p>Time:11:49 AM</p>
 */
public class FlatMapForOneToManyFunction {

    public static void main(String[] args) {
        List<Integer> numbers=List.of(1,2,4);
        System.out.println(numbers.stream()
                .flatMap(e->List.of(e-1,e+1).stream())
                .collect(toList()));
    }
}
