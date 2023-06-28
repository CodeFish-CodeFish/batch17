package arrayPractice;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Practice8 {
    public static void main(String[] args) {

        int[] numbers = {3, 5, 2, 13, 45, 24, 100, 4, 5, 6, 4};

        // before sorting array, print
        System.out.println( Arrays.toString( numbers));
        //sort

        Arrays.sort(numbers);
        // After sorting array, print
        System.out.println( Arrays.toString( numbers));

        // find out the largest number from array

        System.out.println( numbers[0]); // smallest
        System.out.println( numbers[ numbers.length-1 ]);// largest number

        String[] employees = {"Mike", "David", "sam", "SArah", "aLEX", "Natalie", "ana"};

        System.out.println( Arrays.binarySearch(employees, "Mike"));
        System.out.println("+++++++++++++++++++++++++++");
        Arrays.sort(employees);

        System.out.println( Arrays.toString(employees)); // [David, Mike, Natalie, SArah, aLEX, ana, sam]

        // binary search
        System.out.println( Arrays.binarySearch(employees, "Mike") );

        System.out.println( Arrays.binarySearch(employees, "aLEX") );
        System.out.println( Arrays.binarySearch(employees, "efe")  );

        System.out.println("=============================");

        Scanner scanner = new Scanner(System.in);

        Object[] a =  { 1, 23, "text" , 'h' , true, scanner  };


        System.out.println( a[2] );

        System.out.println(  a[2].toString().toUpperCase()  );

    }
}
