package accessModifierPractice;

import java.util.ArrayList;
import java.util.List;

public class Cat extends  Animal{


    public static void main(String[] args) {


        Animal animal = new Animal();

        animal.namePublic= "King";
        animal.weightDefault = 2;
        animal.colorProtected = "yellow";

        animal.runPublic();
        animal.runDefault();
        animal.runProtected();


        Cat cat = new Cat();

        cat.colorProtected= "jrYellow";
        cat.namePublic = "jrKing";
        cat.weightDefault = 22;

       // Animal a3 = new Animal(1);



    }



}
