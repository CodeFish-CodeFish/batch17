package primitivePractice;

public class NumericPromotion {
    public static void main(String[] args) {

        int num1 = 5;
        long long1 = num1;
        double d1 = num1;
        float fl1 = 45.5f;
        d1 = fl1;
        double d2 = fl1;

        // ==========================//
        long result1 = num1 + long1; // there are two different data types, long and int,
        // java promotes larger data type for the result

        double result2 = fl1 + d1;
        // ==========================//

        double result3 = num1 + long1;
        // ==========================//
        short sh1 = 4;
        int result4 = num1 - sh1;
        float result5 = num1 - sh1;
        // ==========================//

        short sh2 = 3;

        //  short result6 = sh1 + sh2; // java promotes int type for every whole number implementation by default
        // if your data types in the operation is/are lower than int type
        // it will not allow you to store it. you should go for int or larger type

        int result6 = sh1 + sh2;

        byte bt1 = 9;

        long result7 = bt1 + sh1;

        double r78 = 5 + 6.1;

        byte r9 = 5 + 4;
        //////
        int a = 5;
      //  byte r10 = a + 4; compile time error

        byte b = 4;
      //  byte r11 = b + 7; compile time error

    }
}
