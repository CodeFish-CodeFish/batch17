package objectPractice;

public class Microphone {

    // instance variables for mic
    String color, brand;
    boolean wired;
    double price;

    public Microphone() {
        System.out.println("No param const");
    }


    //overloading constructor
    public Microphone(String brand) {
        this();
        System.out.println("Init brand in CONST");
        this.brand = brand;
    }

    public Microphone(String color, String brand, boolean wired, double price) {

        this("Google");

        this.color = color;
        this.brand = brand;
        this.wired = wired;
        this.price = price;

    }

    public Microphone(boolean wired, double price, String brand) {

        this(brand);

        this.wired = wired;
        this.price = price;
        this.record();
    }


    public void record() {
        System.out.println("recoding");
    }

    public void printInfo() {
        System.out.println("b - >" + brand);
        System.out.println("c -> " + color);
        System.out.println("price >> " + price);
        System.out.println("wireless >> " + wired);
    }

    @Override
    public String toString() {
        return "Microphone{" +
                "color='" + color + '\'' +
                ", brand='" + brand + '\'' +
                ", wired=" + wired +
                ", price=" + price +
                '}';
    }

    protected void finalize() {

        System.out.println("TRASH");
    }
}

