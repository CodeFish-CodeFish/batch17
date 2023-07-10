package setPractice;

import java.util.HashSet;
import java.util.Set;

public class Flower {

    String color, type;
    Integer price, location;

    public Flower(String color, String type, Integer price, Integer location) {
        this.color = color;
        this.type = type;
        this.price = price;
        this.location = location;
    }

    public static boolean findFlower(HashSet<Flower> flowers, int customerLocation, String type){
        boolean flag = false;
        for ( Flower flower  : flowers ){

           if ( flower.type.equalsIgnoreCase(type) && flower.location == customerLocation){
               flag = true;
               System.out.println("This is the FLOWER >>> "+ flower);
           }
        }
        return flag;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "color='" + color + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", location=" + location +
                '}';
    }

    public static void main(String[] args) {
        HashSet<Flower> set = new HashSet<>();
        Flower f1 = new Flower("Red","Rose", 3, 123);
        Flower f2 = new Flower("Blue","Lily", 2, 111);
        Flower f3 = new Flower("Yellow","Rose", 3, 199);
        set.add(f1); set.add(f2); set.add(f3);

        System.out.println(   findFlower(set, 111, "rose")  );
        System.out.println(   findFlower(set, 111, "lily")  );
    }
}
