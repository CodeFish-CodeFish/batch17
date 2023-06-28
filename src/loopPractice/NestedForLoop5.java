package loopPractice;

public class NestedForLoop5 {
    public static void main(String[] args) {

        // create times table for 1s through 10s

        // 1 * 1 = 1
        // 1 * 2 = 2
        // 1 * 3 = 3


//        for (int x =1; x <=10; x++ ){
//
//            if (x >=4 && x <=6){continue;}
//
//            for (   int y =1; y<=10; y++){
//
//                System.out.println( x +" * "+ y + " = "+ (x* y));
//
//            }
//            System.out.println("====================================");
//
//
//        }

        // you want to see only tables for 1 to 3 and 7 to 10
        int a = 0;

        while (a < 10) {

            a++;
            if (a >= 4 && a < 7) {
                continue;
            }
            int b = 1;

            while (b <= 10) {

                System.out.println(a + " * " + b + " = " + (a * b));
                b++;

            }

            System.out.println("++++++++++");
        }


    }
}
