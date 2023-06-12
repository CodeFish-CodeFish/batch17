package loopPractice;

public class ForPractice1 {
    public static void main(String[] args) {


        // print out numbers from 0 to 10

        // while loop
        int a = 0;
        while (a <= 10) {

            System.out.println(a);
            a++;

        }

        // for Loop

        for (int b = 0; b <= 10; b++) {

            System.out.println(" >> b " + b);

        }

        int c = 0;
        for (; c <= 10; ) {

            System.out.println(" >> c " + c);

            c++;

        }

        int d = 0;
        for (; d <= 10; ) {

            System.out.println(" >> d " + d);

            d++;

        }
        // print out numbers from 20 to 0 decreasing

        for ( int e = 20; e >= 0; e--){

            System.out.println(e);

        }

    }
}
