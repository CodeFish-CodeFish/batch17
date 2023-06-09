package ifStatement;

import java.util.Scanner;

public class NestedIfPractice1 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println( "Do you have your Passport? yes/no"  );
        String passport = scanner.nextLine();

        if ( passport.equalsIgnoreCase("yes")){

            System.out.println("Do you have visa? yes/no");
            String visa = scanner.nextLine();
            if(visa.equalsIgnoreCase("yes")) {
                System.out.println("Good news, you can FLY to MEXICO");
            }else{
                System.out.println("You should have VALID VISA");
            }

        }else{
            System.out.println("You NEED to have valid PASSPORT to travel");
        }




    }
}
