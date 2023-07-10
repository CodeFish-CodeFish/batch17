package mapPractice;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Practice3 {

    public static void main(String[] args) {

        HashMap<String, Integer> hash = new HashMap<>();
        LinkedHashMap<String, Integer> linked = new LinkedHashMap<>();
        TreeMap<String, Integer> tree = new TreeMap<>();

        hash.put("IT", 201);                linked.put("IT",201);               tree.put("IT", 201);
        hash.put("HR", 205);                linked.put("HR",205);               tree.put("HR", 205);
        hash.put("PR", 101);                linked.put("PR",101);               tree.put("PR", 101);
        hash.put("Payroll", 300);           linked.put("Payroll",300);          tree.put("Payroll", 300);
        hash.put("ACC", 155);               linked.put("ACC",155);              tree.put("ACC", 155);
        System.out.println(hash);           System.out.println(linked);         System.out.println( tree);
        // random order                     insertion order                     ascending order

        System.out.println("+++++++++++++");
        // null keys for each map --> tree map does not allow 'null' keys
        hash.put(null, 200);                linked.put(null, 200);             // tree.put(null, 200);
        System.out.println(hash);           System.out.println(linked);         System.out.println( tree);

        System.out.println("+++++++++++++");
        // null values for each map
        hash.put("Info", null);             linked.put("Info", null);           tree.put("Info", null);
        System.out.println(hash);           System.out.println(linked);         System.out.println( tree);

        System.out.println("+++++++++++++");
        // multiple null values for each map
        hash.put("CALL", null);             linked.put("CALL", null);           tree.put("CALL", null);
        System.out.println(hash);           System.out.println(linked);         System.out.println( tree);


        System.out.println("+++++++++++++");
        // null for keys and values for each map --> (since tree map does not allow null key, you cannot put 'null-null' pair)
        hash.put(null, null);             linked.put(null, null);           //tree.put(null, null);
        System.out.println(hash);           System.out.println(linked);         System.out.println( tree);


    }




}
