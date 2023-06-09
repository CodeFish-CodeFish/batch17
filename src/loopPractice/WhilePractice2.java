package loopPractice;

public class WhilePractice2 {
    public static void main(String[] args) {

        /*

            "My age is 23"
            "My age is 24"
            ............
            print your ages all the way from 23 to 30

         */
        int age = 23;
        while ( age <=30 ){

            System.out.println("My age is " +age);
            age++;
        }
        System.out.println("-------------------------------");
        // Task: print out numbers between 15 and 25
        // show me that how many numbers are printed in total.
        // "Total amount of numbers: ... ."

        int number1 =15, number2 =25, total = 0;

        while ( number1 <=number2 ){
                total++;
            System.out.println(number1);
            number1++;

        }
        System.out.println("Total amount of numbers is "+total);

    }
}
