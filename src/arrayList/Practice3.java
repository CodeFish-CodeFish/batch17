package arrayList;

import javax.swing.*;
import java.util.ArrayList;

public class Practice3 {
    public static void main(String[] args) {

        ArrayList<String> cookies = new ArrayList<>();
        // add, get, size
        cookies.add("oreo");
        cookies.add("biskoff");
        cookies.add(1, "metro");

        System.out.println(cookies); //[ .... ,oreo, metro, biskoff]

        cookies.add(0, "chips");
        System.out.println(cookies); // [chips, oreo, metro, biskoff]

        //remove
        cookies.remove(0);
        System.out.println(cookies); // [oreo, metro, biskoff]

        cookies.remove("Metro");
        System.out.println(cookies);
        System.out.println(cookies.remove("metro")); // true

        System.out.println(cookies.remove("M&M")); //FaLSE

        ArrayList<String> cities = new ArrayList<>();

        cities.add("Columbus");
        cities.add("Chicago");
        cities.add("Denver");
        System.out.println(cities);

        //addAll
        cities.addAll(cookies);
        System.out.println(cities);
        System.out.println(cities.get(3));
        System.out.println(cities.get(4));

        //removeAll
        cities.removeAll(cookies);
        System.out.println(cities);

        // contains
        Boolean b1 = cookies.contains("Denver"); // false

        Boolean b2 = cities.contains("Columbus"); // true
        System.out.println(b1);
        System.out.println(b2);

        //isEmpty

        System.out.println( cities.isEmpty());

        cities.removeAll(cities);
        System.out.println( cities );
        System.out.println( cities.isEmpty());

        cities.addAll(cities);
        System.out.println(cities);

        cities.add("Columbus");
        cities.add("Chicago");
        cities.add("N Y");
        System.out.println(cities);

        // ================
        method1(cities);
        // ================
        // clear
        cities.clear();
        System.out.println(cities);

    }

    // create a method that will take an ArrayList of Strings as parameter
    // this method will print strings if they are length of 5 or more letters
    // "This string >>> ..apple..<<< has 5 or more letters"

    // [apple, kiwi]

    public static void method1( ArrayList<String> items ){

        for ( String item : items){
            if (item.length() >=5){
                System.out.println("This string >>> "+ item +"<<< has 5 or more letters");
            }
        }

    }


}
