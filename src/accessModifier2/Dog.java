package accessModifier2;

import accessModifierPractice.Animal;

public class Dog  extends Animal {

    public static void main(String[] args) {

        Animal animal = new Animal();

        animal.namePublic = "ParentDog";

        animal.runPublic();

        Dog dog = new Dog();

        dog.colorProtected = "dogColor";
        dog.namePublic = "Bruno";
        dog.runProtected();
        dog.runPublic();








    }

}
