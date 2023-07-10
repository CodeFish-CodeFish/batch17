package mapPractice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        HashMap<Integer, Integer> numbers = new HashMap<>();
        numbers.put(2, 25);
        numbers.put(5, 45);
        numbers.put(1, 15);


        System.out.println(Practice4.keyFinder(numbers));

        // storing keys in a List which method 'keyFinder' returns.
        List<Integer> keys = Practice4.keyFinder(numbers);
        System.out.println(keys);

        System.out.println("=========");

        Practice4.valueFinder(numbers);
        System.out.println("=========");
        System.out.println(Arrays.toString(Practice4.valueFinder(numbers)));

        Integer[] array1 = Practice4.valueFinder(numbers);
        System.out.println( Arrays.toString(array1));
    }
}
