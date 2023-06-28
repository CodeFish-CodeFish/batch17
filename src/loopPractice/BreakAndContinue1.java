package loopPractice;

public class BreakAndContinue1 {
    public static void main(String[] args) {


        for(int i=0; i < 20; i++){

            System.out.println(i+1+"You can do it!");

            break;

          //  System.out.println(i+1+"You can do it!");

        }

        System.out.println("================");

        for(int i=0; i < 20; i++){

            System.out.println(i+"You can do it!");

            if ( i > 7){
                System.out.println("I am about to stop the loop");
                break;
            }

        }
        System.out.println("================");

        for(int i=0; i < 20; i++){

            System.out.println(i+"You can do it!");

            if ( i == 10){
                System.out.println("I am about to stop the loop");
               break;
            }

        }
        System.out.println("================");

        for(int i=10; i > 0; i--){

            System.out.println(i+"You can do it!");

            if ( i < 4){
                System.out.println("I am about to stop the loop");
                break;
            }

        }

    }
}
