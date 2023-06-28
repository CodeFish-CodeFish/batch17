package loopPractice;

public class ForEachPractice1 {
    public static void main(String[] args) {

        int[] numbers = {3,23,45,23,465,66,77,100};

        // print out every element from array

        for ( int number : numbers ){

            System.out.println( number);
        }
        System.out.println("---------------");
        // as soon as code finds number 66, stop the loop
        //{3,23,45,23,465,66,77,100};

        for ( int number : numbers ){

            System.out.println( number);
         if (number == 66){
             break;
         }
        }
        System.out.println("---------------");
        //{3,23,45,23,465,66,77,100};
        // find out total of given numbers by using for each loop
        int total = 0;
        for ( int n  : numbers ){

            total = total +  n;
        }
        System.out.println(total);


    }
}
