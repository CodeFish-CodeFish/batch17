package ifStatement;

import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        /*
        get an integer number from user
        when the given number is:
            1 --> "It is Monday"
            2 --> "It is Tuesday"
                ....
            5 --> "It is Friday"
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an integer value");

        int number = input.nextInt();

        if (number == 1) {
            System.out.println("It is Monday");
        }
        if (number == 2) {
            System.out.println("It is Tuesday");
        }
        if (number == 3) {
            System.out.println("It is Wednesday");
        }
        if (number == 4) {
            System.out.println("It is Thursday");
        }
        if (number == 5) {
            System.out.println("It is Friday");
        }

        // if given number is none of the covered values -1,2,3,4,5--
        // "there is no matching day for your entry"

        if ( number > 5 || number < 1  ){

            System.out.println("there is no matching day for your entry");
        }



    }
}
