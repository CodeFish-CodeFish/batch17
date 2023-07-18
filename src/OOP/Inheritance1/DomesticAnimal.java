package OOP.Inheritance1;

public class DomesticAnimal extends Animal {

    protected boolean play( int hour){

        System.out.println("Domestic is playing");
        return true;
    }

    @Override
    public String toString() {
        return "DomesticAnimal{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }

    public DomesticAnimal test1(){

        System.out.println("Test1 from DOMESTIC class");
        return new DomesticAnimal();
    }


    public Number run(){

        System.out.println("Run in Domestic");

        return 5;
    }






}
