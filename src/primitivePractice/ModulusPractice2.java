package primitivePractice;

public class ModulusPractice2 {
    public static void main(String[] args) {
        /*
        int number = 678;
        find the sum of digits from given number

        6 + 7 + 8 = 21
        Total of digits is: 21
         */
        int number = 5558;
        int digit4 = number % 10;
        System.out.println( digit4 +" << digit4");

        number = number /10;
        System.out.println( number +" << number now");

        int digit3 = number % 10;
        System.out.println( digit3 +" << digit3");

        number = number /10;
        System.out.println( number +" << number now");

        int digit2 = number % 10;
        System.out.println(digit2 + " << digit2");

        number = number /10;
        System.out.println( number +" << number now");

        int digit1 = number %10;
        System.out.println(digit1 + " << digit1");

        int total = digit1 + digit2 + digit3 +digit4;
        System.out.println("Total of given digits is: "+total);

    }
}
