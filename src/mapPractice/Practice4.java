package mapPractice;

import java.util.*;

public class Practice4 {

    // create a method that will take map<Integer, Integer> as parameter
    // this method will print keys one at a time and return those keys in a List
    // test

    public static List<Integer> keyFinder(HashMap<Integer, Integer> hashMap){

        List<Integer> keysInList = new ArrayList<>();
        Set<Integer> keys = hashMap.keySet();

        for (Integer key:keys){
            System.out.println(">> "+key);

            keysInList.add(key);
        }
        return keysInList;

    }

    // create a method that will take map<Integer, Integer> as parameter
    // this method will print values one at a time and return those values in an Array
    // test

    public static Integer[] valueFinder(HashMap<Integer, Integer> map){

        Collection<Integer> valuesInColl = map.values();
        Integer[] arrayWithValues = new Integer[map.size()];
        int index = 0;
        for (Integer value : valuesInColl){
            System.out.println( "-- "+ value + " --");

            arrayWithValues[index] = value;
            index++;

        }
        return arrayWithValues;


    }










}
