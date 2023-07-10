package arrayList;

public class Computer {
    // instance variables --> make, model, price, screenSize

    String make, model;
    Double price,  screenSize;

    //constructor

    public Computer(String make, String model, Double price, Double screenSize) {
        this.make = make;
        this.model = model;
        this.price = price;
        this.screenSize = screenSize;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", screenSize=" + screenSize +
                '}';
    }
}
