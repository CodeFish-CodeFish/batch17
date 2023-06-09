package ifStatement;

import java.util.Scanner;

public class Practice4 {
    public static void main(String[] args) {
        /*
        get first name of user:
            -if first initial is:
                'M' --> "You get free Laptop
                'D' --> "You get free IPad"
                'A' --> "You get free IPhone"
                'G' --> "You get free smart watch"
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your first name? Please enter to get free item");

        String name = scanner.nextLine().toUpperCase();
        //startsWith()
        //charAt(0)
        char  init = name.charAt(0);

        if ( init =='M' ){
            System.out.println("You get free Laptop");
        }
        if ( init == 'D') {
            System.out.println("You get free IPad");
        }
        if ( init == 'A') {
            System.out.println("You get free IPHONE");
        }
        if ( init == 'G') {
            System.out.println("You get free smart watch");
        }

        if ( init !='M' && init != 'D' && init != 'A' && init != 'G'){
            System.out.println("PLEASE TRY NEXT YEAR");
        }
    }
}
