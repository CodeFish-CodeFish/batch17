package scannerPractice;

import java.util.Scanner;

public class BankAccount {

    public static void main(String[] args) {

        /*
        David wants to deposit his money into his bank account and spent some
        help David to find out his final dollar amount
        -he already got $200 in his account
        -he got three different paychecks ($480, $600 and $350)
        -he can only deposit one paycheck at a time
        -after he got all his money in the account
        -he bought a phone for $599 and headphone for $299
        -calculate his final money in his account
         */

        Scanner scanner = new Scanner(System.in);
        double balance = 200;
        System.out.println("Please enter your first paycheck amount");
        double firstCheck = scanner.nextDouble();
        balance  = balance + firstCheck;
        System.out.println("Your new balance after first check is: " + balance);
        System.out.println("Please enter your second paycheck amount");
        balance += scanner.nextDouble(); // balance = balance + scanner.nextDouble();
        System.out.println("Your new balance after SECOND check is: " + balance);

        System.out.println("Please enter your third paycheck amount");

        balance += scanner.nextDouble();
        System.out.println("Your new balance after THIRD check is: " + balance);

        System.out.println("Please enter phone price");
        double phone$ = scanner.nextDouble();
        balance = balance - phone$;
        System.out.println("Your new balance after buying PHONE is: " + balance);

        System.out.println("Please enter headphone price");
        balance = balance - scanner.nextDouble();
        System.out.println("Your new balance after buying HEAD-PHONE is: " + balance);


    }
}
