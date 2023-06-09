package ifStatement;

import java.util.Scanner;

public class ElseIfPractice2 {

    public static void main(String[] args) {

        /*
        get a number from user
        find out if the number is positive or negative number

        "Your number is Positive"
        "Your number is Negative"
         "Your number must be ZERO"
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an integer value");
        int number = input.nextInt();


        if (number > 0) {
            System.out.println("Your number is positive");
        } else if (number < 0) {
            System.out.println("Your number is negative");
        } else {
            System.out.println("Your number must be ZERO");
        }

    }
}
