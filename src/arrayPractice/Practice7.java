package arrayPractice;

import java.util.Arrays;

public class Practice7 {
    public static void main(String[] args) {

        char[] mixedItems = {'a','b','%','#','@', '1', '*'};
        // find out symbols from given array
        // and store them in a new array
        char[] symbols = new char[mixedItems.length];
       for ( int i=0; i< mixedItems.length;i++  ){

           if ( ! (  (mixedItems[i] >='a' && mixedItems[i] <='z') || ( mixedItems[i] >='A' && mixedItems[i]<='Z')
                          || (mixedItems[i] >= '0' && mixedItems[i] <= '9')  )        ){

              // System.out.println(mixedItems[i]);
              symbols[i] = mixedItems[i];
           }
       }
        System.out.println(Arrays.toString(symbols));


    }
}
