package scannerPractice;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {

        //get full name of the user
        // "you entered your full name as : ..."

        Scanner input = new Scanner(System.in);
        System.out.println("please enter your full name");

        String fullName = input.nextLine();

        System.out.println("you entered your full name as : " + fullName);

        //get age of user
        System.out.println("Please enter your age");

        int age = input.nextInt();
        System.out.println(fullName + " , you entered your age as: " + age);

        // find out age of user in 10 years
        System.out.println( "your age in 10 years be : "+ (age + 10 ));






    }
}
