package loopPractice;

public class NestedForLoop2 {
    public static void main(String[] args) {

        /*
        for hour from 1 to 12
        print hours and minutes and seconds.
        minutes should go from 0 to 59

        1:0
        1:2
        1:2
        1:3
        ...
        1:59
        2:0
        ...
         */

        for( int hour = 0; hour < 13; hour++){

            for (int mins = 0; mins <60; mins++){

                for (int sec = 0; sec <60; sec++)

                System.out.println( hour +" : "+ mins +" : "+ sec);
            }

        }



    }
}
