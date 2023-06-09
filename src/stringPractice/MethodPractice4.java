package stringPractice;

public class MethodPractice4 {
    public static void main(String[] args) {

        String str = "tuesday";
        //startsWith

        System.out.println(str.startsWith("t")); // true

        System.out.println(str.startsWith("teusd")); // false
        System.out.println(str.startsWith("tuesday")); // t

        //endsWith(); T/F

        System.out.println(str.endsWith("y"));
        System.out.println(str.endsWith("day"));
        System.out.println(str.endsWith("tue day"));

        // contains(); will return T/F

        System.out.println(str.contains("ey")); // f
        System.out.println(str.contains("uesd")); // T
        System.out.println(str.contains("TUESDAY"));// F
        System.out.println("+++++++++++++++++");

        System.out.println(str.contains("TUE".toLowerCase())); // T

        "ex".concat("34");
        String day2 = "Tuesday";

        System.out.println(str.contains(day2));

        // equals(); --> return boolean T/F
        boolean result = str.equals(day2); // FALSE
        System.out.println(result);

        day2 = day2.toLowerCase();

        System.out.println(day2.equals(str)); // T

        String day3 = new String("tuesday");

        System.out.println(day2.equals(day3)); // T
        System.out.println(day2 == day3); // F

        System.out.println("------------------------");

        day2 = "tuesDAY";
        String day4 = "TUESday";
        // equalIgnoreCase

        System.out.println(day2.equalsIgnoreCase(day4)); // TRUE

        System.out.println(day4.equalsIgnoreCase(day2));// TRUE

        System.out.println(day2.equalsIgnoreCase(" TUES DAY "));

        // substring(index);

        String item = "computer";

        String part1 = item.substring(3);
        System.out.println("Part1 is " + part1);

        System.out.println( item.substring( 5 )); //

        // substring(index, index)

        String part2 = item.substring(3,5);
        System.out.println("Part2 >> "+part2);

        System.out.println(  item.substring(3,6)    ); //put

        System.out.println(    item.substring( 3, 7));




    }
}
