package arrayPractice;

public class Practice5 {
    public static void main(String[] args) {

        int[] ages = {23, 34,12, 10, 56, 30, 8,14};

        // find out the oldest age.
        // find out the youngest age


        int old = ages[0], young = ages[0];

        for ( int i =1 ; i< ages.length; i++ ){

           if ( old < ages[i]){

               old = ages[i];
           } else if ( young > ages[i]) {

               young = ages[i];
           }

        }
        System.out.println("Oldest age is: "+ old);
        System.out.println("Youngest age is: "+ young);
        System.out.println( "Range is: "+ (old - young));
        System.out.println("Range is from "+ young +" to "+ old);



    }
}
