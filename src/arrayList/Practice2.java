package arrayList;

import java.util.ArrayList;

public class Practice2 {

    public static void main(String[] args) {


        // in an arraylist store 5 of your favorite fruit names
        // print out each fruit name by using traditional for loop(use index number)
        // "I like ...apple..."
        // concat() >> ..apple.. is healthy!

        ArrayList<String> fruits = new ArrayList();

        fruits.add("apple");
        fruits.add("orange");
        fruits.add("kiwi");
        fruits.add("mango");
        fruits.add("grapes");

        for ( int i = 0; i< fruits.size(); i++){

            System.out.println("I like "+ fruits.get(i));
            System.out.println( fruits.get(i).concat(" is healthy")  );
        }



    }


}
