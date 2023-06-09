package scannerPractice;


import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {

        String name = "Alex";
        System.out.println(name);

        System.out.println("What is your name?");

        Scanner scanner = new Scanner(System.in);

        name = scanner.nextLine();

        System.out.println("Your new name is : >> " + name);

        System.out.println("Please enter your last name");
        String lastName = scanner.nextLine();
        System.out.println("Your lastname is >> " + lastName);

        System.out.println("Full name is: " + name + " " + lastName);

        // try to take city of from user and
        // "....john ..... you are living in ......"
        System.out.println("Please enter your city name");

        String city = scanner.nextLine();

        System.out.println(name + " you are living in " + city);

        // .nextLine() --> it will take/read entire line in the console
        // .next() --> it will take/red single word in the console(it will take string until first space)

        System.out.println( "what is your favorite fruit?");

        String fruit = scanner.next();
        System.out.println("You entered >> "+fruit);




    }
}
