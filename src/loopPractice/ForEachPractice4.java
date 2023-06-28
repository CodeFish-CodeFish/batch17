package loopPractice;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ForEachPractice4 {
    public static void main(String[] args) {

        /*
        String str = "father's day";
        reach out every letter by using for each loop
         */
        String str = "father's day";

        String[] colors = {"red", "blue", "yellow", "pink", "violet", "green"};
        // der, eulb, wolley, ..
        // print out every color in reverse version
        // store reversed versions in another array

        String[] reversedColors = new String[colors.length];
        int index = 0;
        for (String color : colors) {

            String reversed = "";
            for (int i = color.length() - 1; i >= 0; i--) {

                reversed += color.charAt(i);

            }
            reversedColors[index] = reversed;
            System.out.println(reversed);
            index++;
        }
        System.out.println(Arrays.toString(reversedColors));

    }
}
