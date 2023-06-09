package primitivePractice;

public class OperatorPrecedence {
    public static void main(String[] args) {

        int a = 8, b = 4, c = 10, d = 5;

        int result1 = b - c / d + a;

        System.out.println(result1); // 12, 10

        System.out.println("--------------");

        int result2 = (c + result1 - b * 2) - a / b;
        System.out.println( result2);

        System.out.println("--------------");

        int result3 = -result2 + result1 * 0 + 23;
        System.out.println( result3); // 23, 13, 33

        double result4 = (-result2 + result1) * 0 + 23;
        System.out.println(result4); // 23

        result4 = result2 + result1;

        System.out.println( result4);
    }
}
