package loopPractice;

import java.util.Scanner;

public class WhilePractice5 {
    public static void main(String[] args) {

        /*
        you have $100 limit for your child's birthday spending
        ask user/child about spending amount
        if there is enough money keep asking for spending amount again
        -keep updating balance after every spending

         */
        Scanner scanner = new Scanner(System.in);

        int balance = 100;
        while ( balance >= 0 ){

            System.out.println("How much do you want to spend? ");
            int spending = scanner.nextInt();

            balance -= spending;

            if (balance <0){
                System.out.println("We will not have enough money");
            }else {
                System.out.println("This is left over money: " + balance);
            }
        }




    }
}
