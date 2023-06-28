package arrayPractice;

import java.util.Arrays;
import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        /*
        ask user to tell you numbers of data(for names of drinks)
        take that many drink names from user
        store them in an array
        show all drink names together

        - if incoming drink name has 4 or less letters, store that drink name into another array
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("how many drinks do you want to store?");
        int numberOfDrinks = scanner.nextInt();
        scanner.nextLine();

        String[] drinks = new String[numberOfDrinks];

        String[] shortDrinks = new String[numberOfDrinks];

        for (int i = 0; i < drinks.length; i++) {
            System.out.println("Please enter " + (i + 1) + ". name of drink");
            String drink = scanner.nextLine(); //  tea

            if (drink.length() <= 4) {
                shortDrinks[i] = drink;
            } else {

                drinks[i] = drink;
            }

        }
        System.out.println("These are the drinks you entered >> " + Arrays.toString(drinks));
        System.out.println( "SHORT DRINK NAMES >> "+ Arrays.toString(shortDrinks));

    }
}
