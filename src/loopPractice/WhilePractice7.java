package loopPractice;

public class WhilePractice7 {

    public static void main(String[] args) {

        /*
         find total of numbers between 1 and 5 inclusive

         1+2+3+4+5 = 15

         Print >>> "The total is: 15"
         */

        int num1 = 1, num2 = 5, total=0 ;


        while (num1 <= num2){

           total += num1;

           num1++;
        }
        System.out.println("The total is: "+total);

    }
}
