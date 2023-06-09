package ternaryPractice;

public class Practice2 {
    public static void main(String[] args) {


        String str = "Tuesday is the best";

        int num1 = 25, num2 = num1 - 10;

        String result1 = num1 > num2 * 2 ? str.concat(" DAY for now") : str.replace("Tuesday is the best", "Wednesday");


        System.out.println(result1);

        System.out.println(result1.equals("Wednesday") ? 45 : 25); //


        System.out.println(7 * 7 != 49 ? "Correct" : 100);


        // Nested Ternary

        int a = 4, b = 10, c = 20;

        String str2 = a + b > c ? a < b ? "Test1" : "test2" : "Nested";


        System.out.println(str2);

        String str3 = a + b < c ? a < b ? "Test1" : "test2" : "Nested";


        System.out.println(str3);

        // check if your birthday is today or not
        // if it is today >> print "Celebration"
        // otherwise print >> "got to wait little bit more"
        String date = "JUN-6-2023";

        String birthDay = "April-6-1990";

        int dayNumber = 6;

        System.out.println(date.equals(birthDay) ? "Celebration" : "got to wait little bit more");

        String part6 = date.substring( date.indexOf('-')+1, date.indexOf('-')+2  );
        System.out.println(part6);

        System.out.println(part6.equals(""+dayNumber) ? "Celebration" : "got to wait little bit more");

        String str4 = "Fluffy";

        System.out.println(str4 + 7 + 10);

        String str5 = "";
        System.out.println( str5 + 5 + 25  );

        System.out.println(""+ 6 + 90);

        System.out.println("===============================");









        String drink = "Ice Tea";


        System.out.println(  drink.contains("tea") ?   drink.concat("COLD")  : drink.substring( drink.indexOf(' ')).equals("Tea") ?  "ICE TEA"   : "GREEN TEA"     );








    }
}
