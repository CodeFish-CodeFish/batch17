package primitivePractice;

public class LogicalPractice1 {
    public static void main(String[] args) {

        // event for kids only for
        // if the age is more than 6 and less than 12, they can attend
        // 10 >> "Your child can attend this special event ..T/F.."

        int age = 3, lowerLimit = 6, upperLimit = 12;

        boolean b1 = age >= lowerLimit;
        boolean b2 = age <= upperLimit;

        boolean result1 = b1 && b2;
        System.out.println("Your child can attend this special event >> " + result1);

        boolean result11 = age >= lowerLimit && age <= upperLimit;
        System.out.println("Your child can attend this special event >> " + result11);

        // you will not pay any delivery fee if your location is in 10 miles from store
        // also if you are living in the zipcode of 60543
        // "You are paying $5 delivery fee ... "

        int distance = 1, requiredDistance = 10, zipCode = 60023, requiredZipCode = 60543;

        boolean deliveryFee = distance <= requiredDistance || zipCode == requiredZipCode;

        System.out.println("You are NOT paying $5 delivery fee >>" + deliveryFee);
        /*
     price$ --> 575.99
	if you have enough money as cash or your credit limit in CC is enough, you can buy it.
	represent the case and print >>> "you are eligible to buy new LapTop ... "
         */

        double price$ = 575.99, myCash = 575, myCreditLimit = 0;

        boolean eligibleToBuy = myCash >= price$ || myCreditLimit >= price$;
        System.out.println("you are eligible to buy new LapTop >> " + eligibleToBuy);

        // or your first initial is 'A' you can also take new laptop

        char specialLetter = 'A', initial ='A';

        eligibleToBuy = myCash >= price$ || myCreditLimit >= price$ || initial == specialLetter;
        System.out.println("you are eligible to buy new LapTop **>> " + eligibleToBuy);

    }
}
