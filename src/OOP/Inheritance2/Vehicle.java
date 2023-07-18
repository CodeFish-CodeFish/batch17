package OOP.Inheritance2;

public class Vehicle {


    protected String model;
    int year;
    public String make;

    //    Methods:
//    move(); --> vehicle is moving
    public void move() {
        System.out.println("vehicle is moving");
    }

    //    stop(); --> return true, vehicle is stopping
    public boolean stop() {
        System.out.println("vehicle is stopping");
        return true;
    }
//    protected start(); --> return true, vehicle is starting

    protected boolean start() {
        System.out.println("vehicle is starting");
        return true;
    }

    //    default accelerate(); --> return 'OneOfObject-> Vehicle/Car'
//
    Object accelerate() {
        System.out.println("Accelerate in Vehicle");
        return new Vehicle();
    }

}
