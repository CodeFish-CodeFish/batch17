package scannerPractice;

import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        // get zipcode from user
        // check if the zipcode  is 60220
        // if zipcodes matches, user will not pay delivery fee
        // "You do not need to pay $5 delivery fee ..T/F."

        Scanner scanner = new Scanner(System.in);
        System.out.println( "What is your zipCode?");
        int userZipCode = scanner.nextInt();

        int givenZipCode = 60220;

        boolean result = givenZipCode == userZipCode;

        System.out.println("You do not need to pay $5 delivery fee " + result);


    }
}
