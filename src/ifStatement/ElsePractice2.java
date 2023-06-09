package ifStatement;

public class ElsePractice2 {
    public static void main(String[] args) {
        /*
        shopping -- discount
        check total amount of spending
        if total$ is 100 or more, user will get 20% discount
        if the total$ is less, user will get only 5% discount
        *calculate final payment for user and PLEASE show it
        -user can know final payment amount after discounts
         */
        double spending = 99;

        if (spending >= 100) {

            // give 20% discount
            double discount20 = spending * 0.20; // discount amount

            System.out.println("Your saving is: $"+discount20);
            double finalPay = spending - discount20;
            System.out.println("Your final payment after 20% discount is: $" + finalPay);

        }else {

            // give 5% discount

            double discount5 = spending * 0.05; //discount amount
            System.out.println("Your saving is: $"+ discount5);
            double finalPay = spending - discount5;
            System.out.println("Your final payment after 5% discount is: $"+finalPay);
        }

    }
}
