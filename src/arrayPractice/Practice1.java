package arrayPractice;

import java.util.Arrays;

public class Practice1 {
    public  static  void main(String[] args){

        int[] numbers = new int[5];


        System.out.println( Arrays.toString(numbers));

        numbers[0] = 25;
        numbers[1] = 30;
        numbers[3] = 12;

        System.out.println( numbers[0] ); // 25
        System.out.println(  numbers[3]); // 12

        // see all of my entries
        System.out.println(   Arrays.toString(numbers )   );// [25, 30, 0, 12, 0]

        //reassignment
        numbers[0] = 55;
        System.out.println(  Arrays.toString(numbers)  ); // [55, 30, 0, 12, 0]
        System.out.println(  numbers[2]  ); //0

      //  numbers[0] = 5.5; data mismatch
        numbers[2] = 7;
        System.out.println( Arrays.toString(numbers));


        System.out.println(  numbers[2] * 100    ); // 700

        System.out.println( numbers.length  ); // 5

        // referring to last index by using length value and stored '10' into last index
        numbers[ numbers.length-1 ] = 10;
        System.out.println(Arrays.toString(numbers));

//        numbers[6] = 32; // ArrayIndexOutOfBoundsException
        System.out.println(Arrays.toString(numbers));

        // reach out every single value on th numbers array one at a time
        // [55, 30, 7, 12, 10]

        for ( int i = 0 ; i < numbers.length ; i++ ){


            System.out.println( numbers[i]);
        }

    }
}
