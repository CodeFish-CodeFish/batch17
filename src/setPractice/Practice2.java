package setPractice;

import java.util.HashSet;
import java.util.Iterator;

public class Practice2 {
    public static void main(String[] args) {

        HashSet<Integer> set3 = new HashSet<>();

        set3.add(24);
        set3.add(50);
        set3.add(5);
        set3.add(12);
        set3.add(35);
        set3.add(20);
        System.out.println( set3 );

        // Iterator

        Iterator iterator = set3.iterator();

        //System.out.println( iterator.next());

        while (iterator.hasNext()){
            System.out.println( "-- "+ iterator.next() +" --");
        }


    }
}
