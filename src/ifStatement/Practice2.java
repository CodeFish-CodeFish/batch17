package ifStatement;

public class Practice2 {


    public static void main(String[] args) {


            String drink = "tea";

            // when the drink value is 'tea'
            // print out 'I like to drink tea when it is hot'
            // otherwise do nothing


        boolean result = drink.equals("TEA");

        if ( drink.equals("tea") ){

            System.out.println("!!!!I like to drink tea when it is hot!!!");
        }

        //=======================

        if ( result ){
            System.out.println("I like to drink tea when it is hot");
        }

        int orange = 25, containerCapacity= 20;

        // We have enough storage for oranges

        if (  containerCapacity >= orange ){

            System.out.println("We have enough storage for oranges");
        }


    }
}
