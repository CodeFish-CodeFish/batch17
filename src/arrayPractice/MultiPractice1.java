package arrayPractice;

import java.util.Arrays;

public class MultiPractice1 {
    public static void main(String[] args) {

        int[][] numbers = new int[5][3];

        System.out.println(Arrays.deepToString(numbers)); // [[System.out.println(Arrays.deepToString(numbers));, 0, 0], [0, 0, 0], [0, 0, 0], [0, 0, 0], [0, 0, 0]]

        numbers[0][0] = 11;
        System.out.println(Arrays.deepToString(numbers));
        numbers[0][2] = 33;
        System.out.println(Arrays.deepToString(numbers));

        // store 44 to second inner array's last index
        numbers[1][2] = 100;
        System.out.println(Arrays.deepToString(numbers));
        numbers[1][numbers[1].length - 1] = 44;
        System.out.println(Arrays.deepToString(numbers));

        // how to print single inner array?

        System.out.println(Arrays.toString(numbers[0])); // [11, 0, 33]

        System.out.println("-----------------");
        // print out every inner array individually

        for (int[] arr : numbers) {

            System.out.println(Arrays.toString(arr));

        }

        // store '99' to the last index of last inner array
        // [[11, 0, 33], [0, 0, 44], [0, 0, 0], [0, 0, 0], [0, 0, 0]]    --> // 99

        numbers[4][2] = 111;

        numbers[ numbers.length-1][ numbers[numbers.length-1].length-1  ] = 99;
        System.out.println(Arrays.deepToString(numbers));



    }
}
