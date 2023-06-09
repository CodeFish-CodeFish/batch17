package stringPractice;

import java.util.Scanner;

public class MethodPractice3 {
    public static void main(String[] args) {
        /*
        TASK: get a string value from scanner
        from given string:
        print out; first char
                   last char
                   index of second matching 'c'
                   length of string
                   index of 'x'
                   middle char --> java  java5
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a String value");

        String text = scanner.nextLine(); // chicago   --> text.charAt( text.length()-1)

        System.out.println(  text.charAt(0)    ); // first char

        System.out.println(    text.charAt( text.length()-1)   ); // last char

        System.out.println(      text.indexOf('c', text.indexOf('c') + 1 )    );
        // cabinet corner casa

        System.out.println(    text.length());

        System.out.println( text.indexOf('x'));

       int middleIndex =  text.length() /2;

        System.out.println(  text.charAt( middleIndex  )   );

        System.out.println("==================");
        String str = "*QR**QWF*QERF*QEFchicago";

        System.out.println( str.indexOf('c'));
        System.out.println( str.indexOf('c',str.indexOf('c')+1));
    }
}
