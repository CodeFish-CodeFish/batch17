package ternaryPractice;

public class Practice1 {
    public static void main(String[] args) {


        int num1 = 4, num2 = 9;


        int result = num2 > num1 ? num1 + num2 : num1 * num2;

        System.out.println(result);

        String result2 = num2 < num1 + 10 ? "This is first side" : "BYE";

        System.out.println(result2);

        boolean result3 = "yes" == "no" ? true : false;
        System.out.println(result3);

        System.out.println(    "yes" == "yes" ? "FALSE" : false              );


        System.out.println("+++++++++++++++++++++++++");

        int a = 3, b = 5;

        String day = "Sunday";

       int result4 =  day.equals("SUNDAY") ? ++a : ++a + a++;

        System.out.println("Value of a is >> "+   a );  //4, 5++++, 6+++, 9, 8+, 5, 10

        System.out.println(result4);


    }
}
