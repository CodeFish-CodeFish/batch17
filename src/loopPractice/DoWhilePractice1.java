package loopPractice;

public class DoWhilePractice1 {
    public static void main(String[] args) {

        int a = 5, b = 10;

        // while

        while(a > b){

            System.out.println("HELLO");
        }
        System.out.println("=====================");

        do{

            System.out.println("BURGER");

        }while ( a > b );
        System.out.println("=====================");


        do {

            System.out.println("PIZZA");// 5, 6, 4,

            a++;


        }while ( a < b );

        System.out.println("============================");

        a =5; b = 6;
        do {

            System.out.println("COKE");
            a++;
        }while (a < b);





    }
}
