package stringPractice;

import java.util.Scanner;

public class MethodPractice6 {
    public static void main(String[] args) {

        /*
        TASK: Ask user to enter a String value which should have space at the beginning or end
            - Replace all letter 'a's with single '*' and letter 'e's with double '**',
            - change all string value to UPPERCASE
            - Find index of First '*'
            - Multiply that above index value of '*' by 10 and
            - Print out the result
         */
        Scanner dataTaker = new Scanner(System.in);

        System.out.println("Please enter a ny string value wit leading or trailing spaces");

        String str = dataTaker.nextLine();
        //deleting leading and trailing spaces
//        str = str.trim();
//        //Replace all letter 'a's with single '*' and letter 'e's with double '**',
//
//        str = str.replace('a', '*');
//        System.out.println(str);
//        str = str.replace("e", "**");
//        System.out.println(str);
//        //change all string value to UPPERCASE
//        str = str.toUpperCase();
//        //Find index of First '*'
//        int indexNumber = str.indexOf('*');
//        //Multiply that above index value of '*' by 10
//       int result =  indexNumber * 10;
//        System.out.println( result );
/*
        TASK: Ask user to enter a String value which should have space at the beginning or end
            - Replace all letter 'a's with single '*' and letter 'e's with double '**',
            - change all string value to UPPERCASE
            - Find index of First '*'
            - Multiply that above index value of '*' by 10 and
            - Print out the result
         */
        System.out.println( str.replace('a','*').replace("e","**").toUpperCase().indexOf('*') * 10);





    }
}
