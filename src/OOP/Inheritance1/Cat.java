package OOP.Inheritance1;

public class Cat extends DomesticAnimal {


    public boolean play(int hour) {

        System.out.println("Cat is playing");

        return false;
    }

    public Cat test1(){
        System.out.println( "test1 in CAT class");

        return  new Cat();
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public Double run() {


        System.out.println("Run in CAT");
        return 0.0;

    }
}
