package loopPractice;

public class ForLoopMultipleTerms {
    public static void main(String[] args) {




        for (  int a =0, b=5, c = 9   ;  a < c  && c > b     ; a++, c--){

            System.out.println("b: "+ b);
            System.out.println("a> "+ a);


        }

        System.out.println("==============================");


        for (int a =0, b=5, c = 9   ;  a < c     ; a++, c--){

            System.out.println("b: "+ b);
            System.out.println("a> "+ a);


        }


        int a =0, b=5, c = 9;

        System.out.println( a + 10 );
        for (  a = 3   ;  a < c     ; a++, c--){

            System.out.println("b: "+ b);
            System.out.println("a> "+ a);

        }
        System.out.println( a );

        System.out.println("=============infinite for loop=================");

//    for ( ; ; ){
//
//        System.out.println("Hi");
//    }


    }
}
