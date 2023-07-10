package mapPractice;

import java.util.HashMap;

public class Task1 {


    //String[] >>  {"strawberry", "apple", "apple", "orange", "banana", "watermelon" "orange", "apple"}

    // keep count of fruits

    // strawberry  - 1
    // apple       - 3
    // orange      - 2

    // ..............
    public static void main(String[] args) {
        String[] fruits = {"strawberry", "apple", "apple", "orange", "banana", "watermelon", "orange", "apple"};

        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < fruits.length; i++) {

            if (map.containsKey(fruits[i])) {

                map.put(fruits[i], map.get(fruits[i]) + 1);

            } else {
                map.put(fruits[i], 1);
            }
        }
        System.out.println(map);


    }


}
