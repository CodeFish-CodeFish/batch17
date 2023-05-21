package primitivePractice;

public class ModulusPractice {
    public static void main(String[] args) {

        int a = 13;
        int b = 2;

        int remainder1 = a % b;
        System.out.println(remainder1);//1

        int result1 = a / b;
        System.out.println("Result1 " + result1); // 6

        int c = 9, d = 5;

        int remainder2 = c % d;
        System.out.println(remainder2); // 4
        int result2 = c / d;
        System.out.println(result2); // 1

        // I have payment for $245
        // monthly payments are $50
        // find out my last month's payment

        int payment = 245, monthly =50;
        int last = payment % monthly;
        System.out.println("Your last payment: $" +last);

        // print out my numbers of installments --> ?
        System.out.println( "Total number of instalments: "+ (payment / monthly + 1  )  );

        // 12 /10 --> 2
        /*
            25 /10 --> 5
            145 /10 -> 5
            207 /10 -> 7

            207 /100 -> 7
            413 /100 --> 13
            125 /100 --> 25

         */





    }
}
