package objectPractice;

public class TestCalculator {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        calculator.a = 4;
        calculator.b = 5;
        calculator.total();

        calculator.sum1(6, 8);
        calculator.sum1(1, 1);
        System.out.println("==================");
        calculator.squareOfNumber(10);
        calculator.squareOfNumber(15);
        calculator.squareOfNumber(19);

        System.out.println("=====================");


        double area = calculator.areaCalculator(1.2, 2.5);

        // The Home depot
        // seed for backyard --> area of backyard
        // tell me the area

        String str = "Test";

        String part = str.substring(2);
        System.out.println("Area " + area);

        double seedAmount = area * 2;
        System.out.println("Seed amount " + seedAmount);

        // printing method

        //  System.out.println(    calculator.squareOfNumber(19)   );

        System.out.println(">>>>" + calculator.areaCalculator(2, 2) + "<<<");


        int[] example = {1, 2};

        double d = calculator.arraySum(example);

        System.out.println("This is sum of array numbers " + calculator.arraySum(example));

        
    }
}
