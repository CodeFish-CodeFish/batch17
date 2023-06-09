package scannerPractice;

import java.util.Scanner;

public class Practice4 {
    public static void main(String[] args) {


        // BMI calculation
        // BMI = weight / height* height
        // get values from user and calculate BMI
        // kg / m
        // "your BMI result is ...."

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your weight in kg");

        double weight = input.nextDouble();

        System.out.println("Please enter your height in meters");

        double height = input.nextDouble();

        double BMI = weight / (height * height);
        System.out.println("Your BMI result is " + BMI);


    }
}
