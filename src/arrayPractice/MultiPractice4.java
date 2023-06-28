package arrayPractice;

import java.util.Arrays;

public class MultiPractice4 {
    public static void main(String[] args) {


        int[][][] numbers = {{{10, 20, 10}, {5, 6}, {6, 7, 8, 8}}, {{8, 8}, {9, 99}}};

        System.out.println(Arrays.deepToString(numbers));
        // count numbers of 8 stored in the array
        int count = 0;
        for (int a = 0; a < numbers.length; a++) {

            for (int b = 0; b < numbers[a].length; b++) {

                for (int c = 0; c < numbers[a][b].length; c++) {

                    if (numbers[a][b][c] == 8) {
                        count++;
                    }
                }
            }
        }
        System.out.println("There are " + count + " number 8s in the array");
        System.out.println("+++++++++++++++++++++++");
        count = 0;
        for (int[][] first : numbers) {

            for (int[] second : first) {

                for (int x : second) {

                    if (x == 8) {
                        count++;
                    }
                }

            }
        }System.out.println("**There are " + count + " number 8s in the array**");


    }
}
