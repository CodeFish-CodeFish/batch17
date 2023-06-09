package ifStatement;

import java.util.Scanner;

public class NestedIfPractice2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("How much is the bill?");

        double bill = scanner.nextDouble();

        if (bill >= 100) {
            System.out.println("David is paying");
            // need to give 20% tip
            double tipDavid = bill * 0.2;

            System.out.println("Total for David is: " + (bill + tipDavid));

        } else {

            System.out.println("Alex is Paying");

            System.out.println("How much cash Alex has?");
            double cashAlex = scanner.nextDouble();

            if (cashAlex > 20) {

                double tipCashAlex = bill * 0.15;

                System.out.println("Alex is paying with cash tip, total is: " + (bill + tipCashAlex));

            } else {

                double tipCardAlex = bill * 0.10;
                System.out.println("Alex is paying with CC, total is: " + (bill + tipCardAlex));
            }

        }

    }
}
