package loopPractice;

import java.util.Scanner;

public class DoWhilePractice2 {

    public static void main(String[] args) {
        /*
        ask user to give you a number --> 6
        create a star tree for the given number as in following
       *
       **
       ***
       ****
       *****
       ******
         */
//        System.out.println("*");
//        System.out.println("**");
//        System.out.println("***");
//        System.out.println("****");
//        System.out.println("*****");
//        System.out.println("******");
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter an integer number for star tree");
        int userNumber = sc.nextInt();

        String str = "*";
        int number = 0;
        do {

            System.out.println(str);
            str += "*";
            number++;

        } while (number < userNumber);


    }
}
