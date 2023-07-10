package mapPractice;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class Practice1 {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap();

        System.out.println(map);

        map.put(11, "Alex");
        System.out.println(map);
        map.put(15, "David");
        map.put(8, "Sam");
        map.put(21, "Ana");
        map.put(16, "John");
        System.out.println(map);
        map.put(11, "Alex");
        System.out.println(map);
        map.put(11, "NEW_STUDENT");
        System.out.println(map);

        map.put(4, "Sam");
        System.out.println(map);

        // get()
        String str1 = map.get(21);
        System.out.println(str1);

        System.out.println(map.get(16));
        System.out.println(map.get("Ana"));

        System.out.println(map.get(2));

        // containsValue()
        System.out.println(map.containsValue("Ana"));

        System.out.println(map.containsValue("Vlad"));

        // containsKey
        System.out.println(map.containsKey(55));
        System.out.println(map.containsKey(21));


        // {16=John, 4=Sam, 21=Ana, 8=Sam, 11=NEW_STUDENT, 15=David}

        // keySet() --> will return all keys from map

        map.keySet();
        System.out.println(map.keySet());

        Set<Integer> keysFromMap = map.keySet();
        System.out.println( keysFromMap);

        // values()

        map.values();
        System.out.println( map.values());

        Collection<String> names =   map.values();

        System.out.println( names );


    }
}
