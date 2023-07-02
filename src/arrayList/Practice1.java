package arrayList;

import java.util.ArrayList;

public class Practice1 {
    public static void main(String[] args) {

        ArrayList zipCodes1 = new ArrayList();

        ArrayList<Integer> zipCodes2 = new ArrayList();

        ArrayList<Integer> zipCodes3 = new ArrayList<>();

        System.out.println(  zipCodes2  );

        zipCodes2.add(11);

        System.out.println(  zipCodes2  );

        zipCodes2.add(22);
        zipCodes2.add(33);
        zipCodes2.add(01);
        zipCodes2.add(9);
        System.out.println(  zipCodes2  );

        // want to print only 33 from the arraylist
        System.out.println( zipCodes2.get(2) ); //

        // get last element
        System.out.println( zipCodes2.size() );

        System.out.println( zipCodes2.get(   zipCodes2.size()-1  ));

        // add, get, size
        // need to print elements one at a time

        for ( Integer a  : zipCodes2) {

            System.out.println( a );
        }



    }


}
