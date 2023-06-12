package loopPractice;

import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        /*
        ========TASK===================

	"This morning we have seen A havy rain in Chicago"

	find and count numbers of 'a' and 'A' in this sentence
     -Steps to solve:
         -need to pick every letter from given sentence
         -check if the picked letter is 'a' or 'A'
         -if it is either one of those ^^
         -count/increase total count
         -at the end show final count
         */
      String str = "This morning we have seen A havy rain in Chicago";

      //  System.out.println(   str.charAt(5)); // will print a single char at index 5

        int indexNumber = 0, counter = 0;

        while ( indexNumber < str.length()){

            if ( str.charAt( indexNumber ) == 'a' || str.charAt(indexNumber) == 'A'  ){

                counter++;
            }
            indexNumber++;
        }
        System.out.println("The total count of a and A is: "+counter);

        // =========================

        System.out.println("+++++++++++++++++++++++++++");
        Random random = new Random();

        int number = random.nextInt(2);

        System.out.println( number);


         // 0 --> Tail 




    }
}
