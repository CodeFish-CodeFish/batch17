package ifStatement;

public class ElsePRactice1 {
    public static void main(String[] args) {

        /*
        oranges = 5, storage = 10
        have enough capacity OR Not
         */

        int orange = 5, capacity = 10;
        if ( orange <= capacity){
            System.out.println("There is enough capacity for oranges");
        }else {

            System.out.println("There is NO enough Space");
        }
        System.out.println("===after picking more oranges====");

        orange = 20;
        if ( orange <= capacity){
            System.out.println("There is enough capacity for oranges");
        }else {

            System.out.println("There is NO enough Space");
        }

    }
}
