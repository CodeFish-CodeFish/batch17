package loopPractice;
public class WhilePractice6 {
    public static void main(String[] args) {

        /*
        String str = "Language";

        print out every letter from given string one by one

        L, a, n, ....
         */

        String str = "Simple";

//        System.out.println(  str.charAt(0)   );
//        System.out.println(  str.charAt(1)   );
//        System.out.println(  str.charAt(2)   );

        // do not print comma after last char

        int number = 0;

        while ( number < str.length()){  // java - 4

            //System.out.print(str.charAt( number) +", ");

            if (number == str.length()-1){
                System.out.print(str.charAt( number) );
            }else {
                System.out.print(str.charAt( number)+", " );
            }

            number++;
        }

        //




    }
}
