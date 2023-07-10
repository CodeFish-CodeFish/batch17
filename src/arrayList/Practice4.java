package arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Practice4 {
    public static void main(String[] args) {

        ArrayList list = new ArrayList<>();

        List<String> list1 = new ArrayList<>();

        //    ArrayList list2 = new List();


        list1.add("blue");
        list1.add("red");
        list1.add("white");

        System.out.println(list1);

        list1.add(3, "black");
        // list1.add(6,"black"); // IndexOutOfBounds exception

        System.out.println(list1);


        // set() --> set will replace the element at a given index, size of arraylist will not change


        list1.set(2, "orange");
        System.out.println(list1);
        list1.set(2, "Yellow");
        System.out.println(list1);


        // converting ArrayList to Array ---> toArray();

        Object[] colors = list1.toArray();

        System.out.println(colors[0].toString().toUpperCase());
        System.out.println(colors.length);

        colors[0] = "GREEN";
        System.out.println(Arrays.toString(colors));

        colors[1] = true;
        System.out.println(Arrays.toString(colors));

        // converting Array to ArrayList/List

        // asList()

        List<Object> list2 = Arrays.asList(colors);

        String[] states = {"IL", "Mo", "VA", "FL"};

        List<String> list4 = Arrays.asList(states);

        System.out.println(list4);

        // list4.add("WA"); // UnsupportedOperationException

        // list4.remove(2); // UnsupportedOperationException


    }
}
