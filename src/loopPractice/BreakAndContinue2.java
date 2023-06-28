package loopPractice;

public class BreakAndContinue2 {
    public static void main(String[] args) {

        for (  int a = 0; a < 10; a++){

            System.out.println("OUTER LOOP");

            for (int b = 0 ; b < 20 ; b++){

                System.out.println("INNER LOOP");
                System.out.println( "a > "+a);
                System.out.println(  "b > "+b);

                break;
            }

            break;

        }

        System.out.println("=================================");

        for (  int a = 0; a < 10; a++){

            System.out.println("OUTER LOOP");

            for (int b = 0 ; b < 20 ; b++){

                if( b > 5){
                    break;
                }
                System.out.println("INNER LOOP");
                System.out.println( "a > "+a);
                System.out.println(  "b > "+b);


            }

            if ( a >= 3){
                break;
            }


        }

        System.out.println("=======+++++++===++++===");

        JOHN:
        for (  int a = 0; a < 10; a++){

            System.out.println("+++OUTER LOOP+++");
            DAVID:
            for (int b = 0 ; b < 20 ; b++){

                if( b > 5){
                    break JOHN;
                }
                System.out.println("INNER LOOP");
                System.out.println( "a > "+a);
                System.out.println(  "b > "+b);

            }

            if ( a >= 3){
                break;
            }

        }
        System.out.println("*****************");

        ALEX:
        for (  int a = 0; a < 10; a++){

            System.out.println("+++OUTER LOOP+++");

            SAM:
            for (int b = 0 ; b < 20 ; b++){

                if( b > 5){
                    break ;
                }
                System.out.println("INNER LOOP");
                System.out.println( "a > "+a);
                System.out.println(  "b > "+b);
                if ( a >= 3){
                    break ALEX;
                }

            }


        }


    }
}
