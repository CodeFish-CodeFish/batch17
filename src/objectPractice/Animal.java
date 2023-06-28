package objectPractice;

public class Animal {

    // instance variables --> belong to object
    // (global variables)
    int age;
    String name = "Riko";
    String color = "WHITE";
    int energyLevel = 100;

    // local variables: any variable in any block

    public void allInfo(){

        System.out.println("age: "+ age+ " name: "+ name+ "  color: "+ color+ " energy: "+ energyLevel);
    }
    public void eat() {
        //    public  int age1 = 7;

        energyLevel = 100;
        System.out.println(color + " - " + name + " is eating\nNow energy level is:"+energyLevel);

    }


    public void run() {

        if (energyLevel >0){
            energyLevel = energyLevel - 10;
            System.out.println(name + " is running\nNow energy level is: "+energyLevel);
        }else {
            System.out.println(name + " need to eat before run again");
        }
    }


}




