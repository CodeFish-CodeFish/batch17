package ifStatement;

import java.util.Scanner;

public class CurlyPranthesisPractice {
    public static void main(String[] args) {


        int apple = 15, mango = 6;

        if (apple < mango)

            System.out.println("First Line -Apple PIE");

        System.out.println("--------Second Line--------");

        System.out.println("*********Third Line********");

        System.out.println("++++++++++++++++++++++++++++++++++");


        int studentNumber = 10;

        if (studentNumber >= 10)
            studentNumber++; //11
        studentNumber++; //12
        System.out.println(studentNumber);// 12


        if (studentNumber > 8)
            ++studentNumber;// 13
        --studentNumber; // 12
        int number = studentNumber + --studentNumber;
        System.out.println(studentNumber); // 23
        System.out.println(number);

        System.out.println("++++++++++++++++++++");

        int a = 4, b = 3, c = a + b;


        if (c < b)
            ++a;// skip
        ++a;
        a++;
        b = a++;
        System.out.println("b is NOW " + b);// 7++++,6+++++,5, 8
        System.out.println("---a---- " + a);
        System.out.println(b);


        System.out.println("++++++++++++++++++++");

        /*
        if the user has driver's license or not
            -has license --> "You're GREAT"
            -no license --> "Please visit DMV"
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you have Driver's License? Yes/No ");

        String answer = scanner.nextLine();

        if (answer.equalsIgnoreCase("YES"))
            System.out.println("You're GREAT");


       else System.out.println("Please visit DMV");


    }
}
