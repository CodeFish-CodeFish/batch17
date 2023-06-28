package arrayPractice;

import java.util.Arrays;

public class SplitPractice1 {
    public static void main(String[] args) {

        String time = "lunch";

        System.out.println(Arrays.toString(time.split("n")));

        String[] split1 = time.split("n");

        System.out.println(Arrays.toString(split1));

        System.out.println(split1[0]); // lu


        String sentence = "Java is getting easy!";
        // I want to get every word separated from the sentence


        String[] words = sentence.split(" ");
        System.out.println(Arrays.toString(words));

        String[] words2 = sentence.split(" ", 2);

        System.out.println(Arrays.toString(words2));
        String[] words3 = sentence.split(" ", 3);

        System.out.println(Arrays.toString(words3));


        // 6-17-2023
        // 6/17/2023
        // 6.17.2023
        // JUN 17,2023

        String data1 = "6-17-2023";

        /*
        if the day is 17 >> print >> "Happy birth day"
         */

        String[] date = data1.split("-");

        System.out.println(Arrays.toString(date));

        if (date[1].equals("17")) {
            System.out.println("HAPPY BIRTH DAY");
        }

        String date3 = "6.18.2023";

        String[] fatherDay = date3.split("\\.");

        System.out.println( Arrays.toString(fatherDay));
    }
}
