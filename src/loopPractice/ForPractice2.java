package loopPractice;

import java.time.chrono.MinguoDate;

public class ForPractice2 {
    public static void main(String[] args) {

        String day = "Sunday";

        // print out letters of day in following format
        // 1. S
        // 2. u
        // 3. n
        // ...




        for ( int index = 0  ;   index <= day.length()-1 ;   index++ ) {

            System.out.println(index +1 + ". "+ day.charAt(index) );

        }


        System.out.println("======================");

        String quote = "There is no BBQ today, it was yesterday!";

        // use for loop
        // print and also count letter 'i' from given string.
        // "I found letter 'i' on the index '..6..'. "

        int count = 0;
        for ( int a= 0  ; a < quote.length()    ; a++  ){

            if ( quote.charAt(a) == 'i'){
                count++;
                System.out.println("I found letter 'i' on the index " + a);
            }

        }
        System.out.println("Total count of 'i' is: "+count);
    }
}
