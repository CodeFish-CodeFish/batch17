package loopPractice;

import java.util.Scanner;

public class WhilePractice4 {
    public static void main(String[] args) {
        /*
        get a number from user
            -6-
            for this given number, create a times table from 1 to 10

            6 * 1 = 6
            6 * 2 = 12
            6 * 3 = 18
            ...
            6 * 10 = 60
         */
        Scanner data = new Scanner(System.in);
        System.out.println("Please enter integer number to create a times table for");

        int userNumber = data.nextInt();

//        System.out.println( 6 +" * " + 1 + " = "+ (6 * 1));
//        System.out.println( 6 +" * " + 2 + " = "+ (6 * 2));
//        System.out.println( 6 +" * " + 3 + " = "+ (6 * 3));
//        System.out.println( 6 +" * " + 4 + " = "+ (6 * 4));
        int number = 1;
        while (number < 11) {

            System.out.println(userNumber + " * " + number + " = " + (userNumber * number));

            number++;
        }

        // create times table for 7

        // 2 to 20 --> but use only even number to create times table

        // 7 * 2 = 14
        // 7 * 4 = 28
        // 7 * 6 = 42
        // .......
        // 7 * 20 = 140

        System.out.println("============================");

//        System.out.println(7 + " * " + 2 + " = " + (7 * 2));
//        System.out.println(7 + " * " + 4 + " = " + (7 * 4));
//        System.out.println(7 + " * " + 6 + " = " + (7 * 6));

        int num1 = 7, num2 = 2;

        while (num2 <= 20) {

            System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));

            num2 += 2; // num2 = num2 + 2;

        }


    }
}
