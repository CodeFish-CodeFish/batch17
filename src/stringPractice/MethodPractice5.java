package stringPractice;

public class MethodPractice5 {
    public static void main(String[] args) {

        // String sentence = "F - JOHN Kennedy - 1999";

        /*
        check IF:
         string starts with F
                starts with M
                contains your name
                ends with your birth year
         */

        String sentence = "F - JOHN Kennedy - 1999";

        System.out.println(sentence.startsWith("F")); // T/F

        //  System.out.println(  sentence.startsWith("F",0));
        System.out.println(sentence.startsWith("M")); // T/F

        System.out.println(sentence.contains("EFE"));
        System.out.println(sentence.endsWith("2000"));

        // get the year from above sentence and make a concat with your favorite month
        // print out the length of final string value  --> 1999MAY --> print --> 7

        // substring()
        //String year = sentence.substring(sentence.indexOf("1"));
        String year = sentence.substring(19);
        System.out.println(year);

        String favorite = year.concat("April");
        System.out.println( favorite);
        int number = favorite.length();
        System.out.println(number);

        // replace();

        String month = "MAY";

        month = month.replace('A', '*');
        System.out.println(month ); //

        month = month.replace("*", "$$");
        System.out.println( month );

        month = month.replace("M$$Y", "APRIL");
        System.out.println(month);

        String ssn = "1234567890";
        // show only last 4 digits of your ssn --like--> *********7890

        ssn = ssn.replace("123456", "******");
        System.out.println(ssn);

        ssn = "44444447890";

        String last4 = ssn.substring( 6,10  );

        String strs = "******";
        System.out.println(strs.concat(last4));

        ssn = "44444447890";
        ssn = ssn.replace( ssn.substring(0,7), "*******" );
        System.out.println(ssn);

        // trim()

        String day = "  Wednesday ";
        day = day.trim();
        System.out.println( day);

        day = "  Wednesday is     today  ";
        day = day.trim();
        System.out.println( day);

        day = "   is today ";

        System.out.println( day.trim()); // is today


    }
}
