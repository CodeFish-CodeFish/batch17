package OOP.Inheritance3;

public class Flower {

    double price;
    String color;
    String smell;
    int height;

    public Flower(double price, String color, String smell, int height) {
        this();
        this.price = price;
        this.color = color;
        this.smell = smell;
        this.height = height;

        System.out.println("flower constructor1");

    }

    public Flower(){
        System.out.println("flower Constructor-No PARAM");
    }

    public Flower(String color, String smell) {
        this.color = color;
        this.smell = smell;
    }
}
