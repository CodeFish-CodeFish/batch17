package mapPractice;

import java.util.HashMap;

public class Task2 {

    /*
    create a method that will take a String for name of person
    this method will count each letter from string and store it to a map
    method should return the result as a map

    John

    J - 1
    o - 1
    ...

    Anna
    A -1
    n -2
    a -1
     */



    public static HashMap<Character, Integer> letterCounter(String name){

        HashMap<Character, Integer> map = new HashMap<>();

        for ( int i = 0; i< name.length(); i++){

            if (map.containsKey( name.charAt(i))){

                map.put(name.charAt(i), map.get(name.charAt(i))+1);
            }else {
                map.put(name.charAt(i), 1);
            }

        }

        return map;
    }

    public static void main(String[] args) {


      HashMap<Character, Integer> resultMap =   letterCounter("Alexandria Smith Brown");

        System.out.println( resultMap );

    }
}
