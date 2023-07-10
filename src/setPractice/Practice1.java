package setPractice;

import java.util.Arrays;
import java.util.HashSet;

public class Practice1 {

    public static void main(String[] args) {

        HashSet set1 = new HashSet(6);
        HashSet<String> set2 = new HashSet();

        set2.add("Alex");
        set2.add("Sam");
        set2.add("David");
        set2.add("Mark");
        set2.add("Bob");

        System.out.println( set2);

     //    set2.get(); no get method


        for ( String name : set2 ){
            System.out.println(  name );
            if (name.equalsIgnoreCase("sam")){
                System.out.println(" Hi "+name);
            }
        }

        System.out.println( set2.contains("Sam"));

        // no duplicates

        System.out.println("=============");
        System.out.println( set2.add("Sam"));
        System.out.println( set2);


        HashSet<Integer> set3 = new HashSet<>();

        set3.add(24);
        set3.add(50);
        set3.add(5);
        set3.add(12);
        set3.add(35);
        set3.add(20);
        System.out.println( set3 );

        set3.add(null);
        System.out.println( set3);

        // count numbers which are greater than 20
        int counter = 0;
        for (Integer i : set3 ){
           // if (i==null)continue;
            if (i != null && i>20){
                counter++;
            }
        }
        System.out.println( counter);

        System.out.println( "+++++ " + counter(set3) + " ++++++++"   );

    }

    // create a method that will count numbers which are greater than 20 in a set collection
    // this method will return the count

    public static int counter(HashSet<Integer> set ){

        int count = 0;
        for (Integer i : set ){

            if (i != null && i > 20){
                count++;
            }
        }

        return count;
    }





}
