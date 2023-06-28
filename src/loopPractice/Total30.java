package loopPractice;
public class Total30 {
    public static void main(String[] args) {
        /*
           { 14, 17, 15, 9, 18, 8, 12, 16, 21 }
           // find out pairs of number which can make total of 30

           // 14 and 16 makes 30
           // 9 and 21 makes 30
           // 18 and 12 makes 30
         */
        int[] numbers = { 30,14, 17, 15, 9, 18, 8, 12,15, 16, 21,0 };


        for (int i = 0; i< numbers.length; i++){

            for (int m = i+1; m< numbers.length; m++){

                if ( numbers[i] + numbers[m] == 30){

                    System.out.println( numbers[i] +" and "+ numbers[m] +" makes 30!");
                }
            }

        }





    }
}
