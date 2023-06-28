package arrayPractice;

import java.util.Arrays;

public class Practice4 {
    public static void main(String[] args) {

        int[] zipcodes = { 111, 222, 333, 444, 555, 666 };
        System.out.println(Arrays.toString(zipcodes));
        System.out.println( zipcodes.length);

        //reassignment
        zipcodes[5] = 999;
        System.out.println(Arrays.toString(zipcodes));
       // zipcodes[6] = 777; // ArrayIndexOutOfBoundsException

        // task:

       // print out zipcode that is greater than 400
        // how many zipcodes are greater than 400?
        //  how many zipcodes are less than 400?

int c = 0, l=0;
        for (int y =0;  y< zipcodes.length; y++){

          //  zipcodes[y] > 400
            if (zipcodes[y] > 400){
                System.out.println( zipcodes[ y ] );
                c++;
            }else {
                System.out.println(zipcodes[y]);
                l++;
            }

        }
        System.out.println("how many zipcodes are greater than 400? " + c);

        System.out.println(l);



    }
}
