package stringPractice;

public class Practice1 {

    public static void main(String[] args){

        String name = "Alex";
        System.out.println( name); // Alex
        // reassigning a new value
        name = "David";
        System.out.println( name); //David

        // reassigning a new value
        name  = "David " + "White";
        System.out.println( name); // David White

        String lastName = "Smith";
        System.out.println( name + lastName); // David WhiteSmith

        lastName = "White";

        System.out.println( name + lastName);// David WhiteWhite

        name += "Sam"; // name = name + "Sam"; --> David White + Sam
        System.out.println( name); //

        System.out.println( 25 + name);// 25David WhiteSam
        System.out.println( 25 +10 +name);// 35David WhiteSam
        System.out.println(name + 25 + 10); //David WhiteSam2510
        System.out.println( name + 25 +10 +true);// David WhiteSam2510true

        System.out.println( lastName );
        System.out.println( name );

        String text = 44 + 10 + name + (55 +10);
        System.out.println(text);  // David WhiteSam55

        name = "John" + " Deer";  // concatenation --> attaching/adding to the string
        
        String  city = new String("Chicago");
        System.out.println( city); //

        String state = new String();
        state = "Illinois";
        System.out.println( state );

        String number = "1";
        number += "2";
        number +=2;
        System.out.println(number);

        int a = 5;







    }

}
