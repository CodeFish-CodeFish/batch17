package OOP.Inheritance2;

public class Car extends Vehicle {
    String model;
    String engineSize;

    // Override move(); --> Car is moving
     @Override
    public  void move(){
        System.out.println("Car is moving");
    }

    //Override accelerate(); --> return Integer and calls model from parent class

    Integer accelerate(){
               super.model = "SL45";
        System.out.println( " >>> "+ super.model );
        return 50;

    }

    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        Car c = new Car();
        v.accelerate();
        v.start();
        v.move();
        v.stop();
        System.out.println("------------------------");
        c.start();
        c.move();
        c.accelerate();
        c.stop();
        System.out.println("------------------------");
        System.out.println(v.model);
    }
}
