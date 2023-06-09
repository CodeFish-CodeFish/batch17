package stringPractice;

public class MethodPractice2 {
    public static void main(String[] args) {
        String str = "Car";
        String x = str.concat(" is blue color");

        System.out.println("str >>> " + str); // Car
        System.out.println("x >> " + x);// Car is blue color

        System.out.println(str.length()); // 3
        System.out.println(x.length()); //17

        String device = "microphone";

        // charAt();

        System.out.println(device.charAt(2)); // c,

        char letter = device.charAt(2);

        System.out.println(device.charAt(2) == letter);// TRUE

        // indexOf();

        int indexForc = device.indexOf('c'); // 2

        System.out.println("indexForc >> " + indexForc);

        int indexForPH = device.indexOf("ph"); // 5
        System.out.println(indexForPH);

        //microphone
        System.out.println(  device.indexOf('o')  );  //

        System.out.println(   device.indexOf("one"));

        System.out.println(    device.indexOf('o',5));

        System.out.println( device.indexOf('x')); // -1

        String str2 = "New York";
        System.out.println( str2.indexOf(' '));//

        String quote = "do Whatever IT taKEs.";
        System.out.println(quote);
       str2  = quote.toLowerCase();
        System.out.println( str2); //

       str2 =  quote.toUpperCase();


        System.out.println(str2);
        System.out.println( quote == str2 ); // FALSE

        System.out.println(     "John" == "john"); // FALSE


    }
}
