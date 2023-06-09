package ifStatement;

import java.util.Scanner;

public class ElsePractice3 {
    public static void main(String[] args) {

        // let's get house number of user
        // if the number is even -> "Your house must be on Right(NW) side of the street"
        // otherwise number is odd -> "Your house must be on Left(SE) side of the street"

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your house number");
        int number = scanner.nextInt();


        if ( number % 2 == 0 ){
            System.out.println( "Your house must be on Right(NW) side of the street");
        }else {
            System.out.println("Your house must be on Left(SE) side of the street");
        }



    }
}
