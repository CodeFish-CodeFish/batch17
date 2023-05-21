package primitivePractice;

public class MultipleVariables {

    public static void main(String[] args) {

        byte b1 = 9;
        byte b2 = 8;

        int a = 2, b = 5, c = 5;

        System.out.println(c * b - a);

        b = a + c; // b = 7

        c = a + b; // c = 2 + 7 ==> 9

        System.out.println("the value for the c: " + c); //7, 12, 9,

        int num1, num2 = 10, num3 = num2 + 10, num4;

        num1 = num3 + 10;

        num4 = num1;
        System.out.println("Value of num1 " + num1); // 30,

        int num5 = 9;
        double d1 = 9.9;


    }

}
