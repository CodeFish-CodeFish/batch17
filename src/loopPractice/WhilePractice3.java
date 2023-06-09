package loopPractice;

import java.util.Scanner;

public class WhilePractice3 {
    public static void main(String[] args) {


        /*
        get an integer number from user

        find out divisors of the given number

        print out those divisors

        10 --> 1,2,5,10
        15 --> 1,3,5,15
        4  --> 1, 2, 4
        50 --> 1,2,5,10,25,50
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an integer number");
        int number = scanner.nextInt(), divisor = 1;


      while ( divisor <=number ){


          if ( number % divisor == 0){


              System.out.println(divisor + " is divisor of "+number);

          }

          divisor++;

      }










    }
}
