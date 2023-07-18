package OOP.Inheritance3;

public class Rose extends Flower{

    int numberOfLeaves;

    public Rose(int numberOfLeaves){

        super(3.4,"White","flower", 5);

        this.numberOfLeaves = numberOfLeaves;
        System.out.println("abdfads");
    }

    public Rose(String color, String smell, int numberOfLeaves) {
        super(color, smell);
        this.numberOfLeaves = numberOfLeaves;
    }

    public static void main(String[] args) {

        Rose rose1 = new Rose(12);
        System.out.println("-------------");
        System.out.println( rose1.color);

        System.out.println("-------------");
        Flower flower1 = new Flower(9.9, "Yellow","GOOD", 3);

        System.out.println(flower1.color);


    }


}
