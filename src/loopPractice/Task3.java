package loopPractice;
public class Task3 {
    public static void main(String[] args) {
        /*
        write a java program to find out
        if given number is a perfect number or not

        6: --> 1,2,3 --> total of divisors is 6 which equals to 6
        that is why 6 is perfect number.
         */
        int number = 6, total = 0;

        for (  int divisor = 1; divisor < number; divisor++ ){

            if (number % divisor == 0){
                total += divisor;
            }

        }
        if (number == total)
            System.out.println(number + " --  PERFECT Number");
        else System.out.println("NOT PERFECT");



    }
}
