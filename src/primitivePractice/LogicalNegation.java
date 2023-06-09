package primitivePractice;

public class LogicalNegation {
    public static void main(String[] args) {
        //! --> if you use '!' front of any boolean variable or boolean condition/result,
        // it will make it opposite value.

        boolean haveMoney = false;
        System.out.println( haveMoney ); // false

        System.out.println( !haveMoney ); // true

        System.out.println( haveMoney ); // false

        // re-assignment
        haveMoney = !haveMoney;
        System.out.println( haveMoney ); // true


        boolean bank = haveMoney;

        System.out.println( !bank ); //
        System.out.println( bank );


    }
}
