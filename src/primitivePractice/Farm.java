package primitivePractice;

public class Farm {

    public static void main(String[] args) {

        /*
        1- calculate number of legs in the farm if;
            there are 25 chickens and 14 cows at the farm
        -create some variables to represent data
        print -> 'Total number of legs in this farm is: ...'
        2- worth of this farm if:
            each cow cost is:      $1525.99
            each chicken cost is : $14.98
            print -> "the worth of this farm is: ..."
         */
        int chickens = 25, cows = 14, eachChickenLeg = 2, eachCowLeg = 4, totalLegs;

        totalLegs = chickens * eachChickenLeg + cows * eachCowLeg;

        System.out.println("Total number of legs in this farm is: " + totalLegs);
        // in the another farm we have 100 more legs
        // find out total legs in both farm
        System.out.println(totalLegs + 100);
        // find out total numbers of bracelet if you want to put 2 bracelet for each leg
        System.out.println(" Bracelet: " + (totalLegs * 2));

        System.out.println("===========calculating worth of farm============");

        //each cow cost is:      $1525.99
        //each chicken cost is : $14.98

        double cowCost = 2000, chickenCost = 20;
        double totalCost = cows * cowCost + chickens * chickenCost;

        System.out.println( "The worth of this farm is: $"+ totalCost);














    }
}
