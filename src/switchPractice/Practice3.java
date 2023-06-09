package switchPractice;

import java.util.Scanner;

public class Practice3 {

    public static void main(String[] args) {
        /*
        mango 9, watermelon 5, kiwi 15, apple 25, dragon fruit 4, orange 10
        ask user for their favorite fruit
        if user's favorite fruit is in the store
        "We have your favorite fruit in the store"
        "Sorry, we do not have your favorite fruit"
         */
      int  mango =9, watermelon =5, kiwi =15, apple= 25, dragonFruit =4, orange =10;
        Scanner scanner = new Scanner(System.in);
        System.out.println("These are available fruits in the store with their quantities: " +
                "\nmango 9, \nwatermelon 5, \nkiwi 15, \napple 25, \ndragon fruit 4, \norange 10");
        System.out.println("Please enter your favorite fruit name");

        String fruit = scanner.nextLine().toLowerCase(); // APPLE
        System.out.println("How many do you want to order? please enter quantity: ");
        int number = scanner.nextInt();
        switch (fruit){
            case "mango":
                System.out.println("We have your favorite fruit in the store" );
                if (mango >= number){
                    System.out.println("Ordering " + number +" mangoes. Store has: "+ (mango -number) + "left over mangoes");
                }else {
                    System.out.println("There is no enough mango in the store. we have only: "+mango +" mangoes available to order");
                }

                break;
            case "watermelon":
                System.out.println("We have your favorite fruit in the store" );break;
            case "kiwi":
                System.out.println("We have your favorite fruit in the store" );break;
            case "apple":
                System.out.println("We have your favorite fruit in the store");
                System.out.println("Ordering " + number +" apples. Store has: "+ (apple -number) + "left over apples");
                break;
            case "dragon fruit":
                System.out.println("We have your favorite fruit in the store"); break;
            case "orange": System.out.println("We have your favorite fruit in the store"); break;
            default:
                System.out.println("Sorry, we do not have your favorite fruit");
        }
    }
}
