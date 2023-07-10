package mapPractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Practice5 {
    public static void main(String[] args) {

        HashMap<String, Integer> hash = new HashMap<>();

        hash.put("IT", 201);
        hash.put("HR", 205);
        hash.put("PR", 101);
        hash.put("Payroll", 300);
        hash.put("ACC", 155);
        System.out.println(hash); // {  ACC=155,    PR=101,     Payroll=300,    HR=205,     IT=201  }


        // entrySet


        hash.entrySet();



        System.out.println(hash.entrySet());

        Set<Map.Entry<String, Integer>> pairs = hash.entrySet(); // {ACC=155, PR=101, Payroll=300, HR=205, IT=201}
        System.out.println(pairs);

        System.out.println("*******************************");
        for ( Map.Entry<String, Integer> pair  :   pairs){

          //  System.out.println( pair);


            // want to have specific pair
            if (pair.toString().equals("Payroll=300")){
                System.out.println("I got it");
                System.out.println(pair);
            }


        }
//        System.out.println("----------");
//        // another way for printing/using pairs from map
//
//        for ( Object object : hash.entrySet()){
//            System.out.println( object);
//        }








    }
}
