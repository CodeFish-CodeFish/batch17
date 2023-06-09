package stringPractice;

public class MethodPractice1 {
    public static void main(String[] args) {

        String day = "Sunday";

        // concat();
        day = day.concat(" is Sunny ");
        System.out.println(day); // Sunday is Sunny

        String week = "Second";

        week += " week is about to be over";
        System.out.println(week); //

        day = day.concat(week);
        System.out.println(day); //

        day += day.concat(week);
        System.out.println(day); //

        String city = "Chicago";

        String cityState = city.concat(" is in IL");
        System.out.println(cityState);

        // length(); will return/gives back count of total characters from the string
        int l = city.length();
        System.out.println("The length of the city is: " + l);

        System.out.println(cityState.length());

        System.out.println(cityState.length() * 100);

        // charAt(); will return character from a specific position/index

        city = "Ney York";

        char letter = city.charAt(1); //
        System.out.println(" >>> " + letter);
        System.out.println(city.charAt(1));

        System.out.println( city.charAt(0)); // N

        System.out.println( city.charAt(3)); //SPACE
        System.out.println( city.charAt(7)); //k

     //   System.out.println( city.charAt(25)); // StringIndexOutOfBoundsException

        System.out.println( "***********");


    }
}
