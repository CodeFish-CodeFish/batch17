package primitivePractice;

public class ComparisonPractice1 {
    public static void main(String[] args) {

        int a = 5, b = 10;

        // == --> t/f
        boolean result1 = a == b;
        System.out.println( "Result1 >>> "+ result1); // false
        System.out.println(  5 == 10   ); // false

        boolean result2 = result1 == false;

        System.out.println("Result2 >> "+result2);

        double number = 5.5;

        System.out.println( number == a); //

        System.out.println( "John" == "John");

        char letter1 = 'a', letter2 = 'A';
        boolean result3 = letter2 == letter1;
        System.out.println( "Result3 >> "+result3);
        char letter3 = 67;
        System.out.println( letter3 == letter1 ); //


        System.out.println( "John" == "JOHN"); // false

        // '>' --> greater than --> T/F

        int num1 = 12, num2 = 12;

        boolean result4 = num2 > num1;
        System.out.println("Result4 >> "+result4);

        int money = 600, item$ = 799;
        //"is your money enough for item? ...  "

        boolean result5 = money > item$;
        System.out.println("is your money enough for item? "+ result5);

        System.out.println(  'A' > 'B'); //

        // '<' --> less than --> T/F

        boolean result6 = money < item$;

        System.out.println( !false == result6); // true

        System.out.println( 9 < 1); //False

        //=========================

       // '>=' --> greater or equal ---> T/F

        boolean result7 = item$ >= money;

        System.out.println(result7);// true

        int item2$ = 799;
        System.out.println( item2$ >= item$); // TRUE
        System.out.println(  6 >= 6  ); //TRUE

        // '<=' --> less than or equal ---> T/F


        System.out.println( item$ <= item2$); // T

        boolean result8 =  item$ <= money;

        System.out.println("Result8 >> "+result8);

        // '!=' not equal --> T/F

        int num3 = 20, num4 = 30;

        boolean result9 = num3 != num4; // TRUE
        System.out.println(result9);

        System.out.println( !true != !false); //
        System.out.println( num3++ + 10 != 30  ); //

        System.out.println( ++num3 == num4-- - 9);//

        // it is possible to use unary operator with char

        char letter4 = 'B';
        System.out.println( ++letter4); // C
        System.out.println( ++letter4); // D

        letter4--;
        --letter4;
        System.out.println( letter4); //

        System.out.println( 'B' != letter4--); //









    }
}
