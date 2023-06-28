package arrayPractice;

import java.util.Arrays;

public class Practice2 {
    public static void main(String[] args) {


        String[] names = new String[4];

        System.out.println(Arrays.toString( names ));

        names[0]= "Alex";
        names[1] = "Sam";
        names[2]="Molly";
        names[3]= "David";

        System.out.println(Arrays.toString( names ));

        // name is 'Molly' --> Should be rich
        //                  --> candidates for becoming rich


        for ( int i = 0; i< names.length; i++  ){

            if (names[i].equalsIgnoreCase("molly")){
                System.out.println( names[i] + " RICH" );
            }else {
                System.out.println( names[i] + " CANDIDATE");
            }
        }
    }
}
