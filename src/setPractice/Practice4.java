package setPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Practice4 {
    public static void main(String[] args) {

        // [45,56,23,30,45,50,30] << are in arrayList

        // find out repeating elements from this list and PRINT THEM

        // include >> set << into your solution

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(45,56,23,30,45,50,30));

        HashSet<Integer> hashSet = new HashSet();

//        System.out.println(  hashSet.add(1)   );
//        System.out.println(  hashSet.add(1)   );
//
        for (Integer i: numbers){

           //  hashSet.add(i);

             if (    hashSet.add(i)   ){

                 System.out.println( "I am rolling to the set bucket >> "+i);
             }else {
                 System.out.println( "duplicate number >> "+i);
             }
        }


        System.out.println("List --> "+numbers);
        System.out.println( "Set ---> "+hashSet);
    }
}
