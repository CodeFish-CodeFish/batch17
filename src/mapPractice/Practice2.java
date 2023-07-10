package mapPractice;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Practice2 {
    public static void main(String[] args) {

        HashMap<String, String> hashMap = new HashMap();

        hashMap.put("chicago", "IL");
        hashMap.put("springfield", "OH");
        hashMap.put("des plaines", "IL");
        hashMap.put("dallas", "TX");
        hashMap.put("N-Y ", "N*Y");

        // size()
        System.out.println(hashMap.size());
        System.out.println(hashMap);

        // create  logic to print out all keys from map one by one

        Set<String> keys = hashMap.keySet();

        for (String key : keys) {
            System.out.println(key);
        }
        // similar solution for above; by using keySet() call in for each loop
        System.out.println("---------------------");
        for (String key : hashMap.keySet()) {
            System.out.println(key);
        }

        System.out.println("--------------------");
        // create  logic to print out all values from map one by one

        Collection<String> valuesFromMap = hashMap.values();
        for (String value : valuesFromMap) {
            System.out.println(value);
        }
        System.out.println("--------------------");
        for (String value : hashMap.values()) {
            System.out.println(value);
        }

        // replacing
        System.out.println(hashMap);
        hashMap.replace("chicago","NE");
        System.out.println(hashMap);

        hashMap.put("chicago","WI");
        System.out.println( hashMap );

        hashMap.replace("miami","FL");
        System.out.println(hashMap);
        hashMap.put("miami","FL");
        System.out.println(hashMap);

        hashMap.replace("miami","FL","*FL*");
        System.out.println(hashMap);

        // isEmpty
        System.out.println( hashMap.isEmpty());

        //remove
        hashMap.remove("miami");
        System.out.println(hashMap);

        hashMap.remove("N*Y");
        System.out.println( hashMap.remove("N*Y"));
        System.out.println( hashMap);
        // clear
        hashMap.clear();
        System.out.println( hashMap);

    }
}
