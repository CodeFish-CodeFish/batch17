package ifStatement;

import java.util.Scanner;

public class Practice5 {
    public static void main(String[] args) {

        /*
        store to order some items
            charge for delivery if your distance is 5 miles away or more --> $5
            if your location is in zipcode 60025, you do not pay delivery fee regardless of the distance and they 10 pc free bread
            if you are living closer(less than 5 miles), you get 5 pc of garlic bread for free
            if your distance is far(5 or more miles away), you get only 1 pc of garlic bread

            inform user about delivery fee and numbers of bread they get
            inform store for numbers of garlic bread left over for reference, so they can make more
            in store number for bread is 50
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your distance from store in miles");
        int distance = scanner.nextInt();
        System.out.println("Please enter your 5 digit zip code");
        int zipCode = scanner.nextInt();
        int breads = 50;

        if (distance >=5 && zipCode != 60025){

            System.out.println("Your delivery fee is $5");
            System.out.println("You also get a free pc of bread" );
            breads -= 1;
            System.out.println("***Number of breads now ****"+ breads);
        }else if(zipCode == 60025){

            System.out.println("You get FREE delivery");
            System.out.println("You also get 10 free pc of bread" );
            breads -= 10;
            System.out.println("***Number of breads now ****"+ breads);
        }else{
            System.out.println("You get FREE DELIVERY for your order ");
            System.out.println("You also get 5 free pc of bread" );
            breads -= 5;
            System.out.println("***Number of breads now ****"+ breads);
        }


    }
}
