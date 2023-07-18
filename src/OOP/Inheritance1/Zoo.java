package OOP.Inheritance1;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    public static void main(String[] args) {

        Animal animal = new Animal();

        animal.name = "Happy";
        System.out.println(animal.name);

        animal.sleep();

        animal.eat();

        WildAnimal wildAnimal = new WildAnimal();
        System.out.println(wildAnimal.name);
        wildAnimal.eat();

        System.out.println("================");
        Lion lion = new Lion();

        lion.eat();
        lion.name = "Simba";
        lion.eat();

        System.out.println(lion.name);

        System.out.println("================");

        animal.sleep();

        wildAnimal.sleep();

        lion.sleep();
        System.out.println("================");

        DomesticAnimal domesticAnimal = new DomesticAnimal();
        domesticAnimal.play(4);


        Cat cat = new Cat();
        cat.play(8);

        System.out.println("================");

        DomesticAnimal d1 = domesticAnimal.test1();

        System.out.println(d1);

        Cat c1 = cat.test1();
        System.out.println(c1);

        System.out.println("================");

        DomesticAnimal c2 =  cat.test1(); // returning a new cat object

        System.out.println( c2 );



    }
}
