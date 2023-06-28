package loopPractice;

public class Task2 {
    public static void main(String[] args) {

        /*
        String str = "EFE";
        check if given string is palindrome or not
         */
        String str = "anna";
        String reversed = "";


        for (int index = str.length() - 1; index >= 0; index--) {

            reversed += str.charAt(index);

            //   System.out.print( str.charAt(index));
        }
        System.out.println(reversed);

        if (reversed.equals(str)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("NOT palindrome");
        }


        /*
        10 --> divisors >> 1 + 2 + 5 = 8
        4  --> 1,2
        6  --> 1,2,3 ==> 6
         */





    }
}
