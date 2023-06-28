package objectPractice;

import java.util.Arrays;

public class Car {
    String color, make, model;
    int year;

    // method

    public void accelerating() {

        System.out.println(make + " accelerating very quick");
    }

    // constructors
    public Car(String color, String make, String model, int year) {
        this.year = year;
        this.model = model;
        this.color = color;
        this.make = make;
        System.out.println(">>FOUR CONT<<");

    }

    public Car(String color, String make) {

        this.color = color;
        this.make = make;
        System.out.println(">>TWO CONT<<");

    }

    public static void main(String[] args) {
        Car car1 = new Car("White", "BMW");
        Car car2 = new Car("Black", "Lexus");

        Car car3 = new Car("White", "Audi", "Q7", 2023);
        Car car4 = new Car("Gray", "Toyota", "Camry", 2023);

        /*
        store your newly created car objects in an array
	        from the new array:
		    find out if the year of the car is 2023
		    print >> "You have a brand new car"
         */

        Car[] dealer = {car1, car2, car3, car4};

        // see color of first car
        System.out.println(car1.color);

        // see color of first car from array

        System.out.println(dealer[0].color);

        for (Car vehicle : dealer) {

            if (vehicle.year == 2023) {
                System.out.println(vehicle.year + " you have a brand new car " + vehicle.make);
            }
        }

    }


}
