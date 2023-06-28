package objectPractice;

public class Calculator {

    // creating two instance variables a, b
    int a, b;
    // create a method that will show total of 2 integer numbers

    public void total() {
        //  int a = 9, b = 7;
        System.out.println("Total: " + (a + b));
    }

    // create a method that will show total of 2 integer numbers
    public void sum1(int num1, int num2) {

        System.out.println("Sum is >> " + (num1 + num2));

    }

    // create a method that will take one int parameter
    // this method will print square of given number

    public void squareOfNumber(int number) {
        System.out.println("Square of " + number + " is " + (number * number));
    }

    // create a method that will calculate area of a rectangle
    // make sure your method can calculate decimal numbers
    // print the area after calculation
    // A = l * w

    public double areaCalculator(double length, double width) {

        double area = length * width;
        System.out.println("The area is: " + area);
        return area;

    }

    // overload areaCalculator method that will calculate area of a triangle
    // make sure your method can calculate decimal numbers
    // print the area after calculation
    // A = 1/2 * height * base

    public double areaCalculator(float base, float height) {

        double area = base * height / 2;
        System.out.println("The area is: " + area);

        return area;

    }
    // overload areaCalculator method that will calculate area of a triangle or rectangle
    // as parameter take name of shape, and decide for calculation for given shape
    // return area for given shape
    // 5, 10 , triangle --> a -> 25
    // 5, 10 , rectangle --> a -> 50

    public double areaCalculator(String shape, double base, double height) {
        double area = 0;
        if (shape.equalsIgnoreCase("rectangle")) {
            area = base * height;

            System.out.println("The area for " + shape + " is : " + area);
            //   return area;

        } else if (shape.equalsIgnoreCase("triangle")) {

            area = base * height / 2;

            System.out.println("The area for " + shape + " is : " + area);
            //  return  area;

        } else {
            System.out.println("There is no matching shape to do calc.. rectangle/triangle");
        }

        return area;
    }

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        calculator.areaCalculator("triangle", 5, 10);
        calculator.areaCalculator("abcd", 5, 10);
        calculator.areaCalculator("RECTANGLE", 5, 10);

        calculator.areaCalculator(3,4.5);

    }











    /*
            create a method that will take an integer array as parameter
        this method will calculate total of numbers from given array
        this method will return the sum as double
     */

    public double arraySum(int[] numbers) {
        double sum = 0;

        for (int num : numbers) {

            sum += num;
        }

        return sum;
    }


}
