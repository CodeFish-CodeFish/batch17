package objectPractice;

public class Pet {

    String name, color;
    int age;
    static int foodAmount = 20;

    // create a method that will do following
    // print out "..tom.. is eating and now
    //                  left over food amount is ..19.."
    //this method should reduce food amount by 1 for every call

    public int feeding() {

        foodAmount -= 1;
        System.out.println(name + " is eating, now left over food amount is " + foodAmount);

        // static "play" method called in non-static "feeding"
      //  play();
        return foodAmount;
    }

    public static void play() {
        // non-static "feeding" method cannot be called in static
        // "play" method just by using its name
        // feeding();
        Pet pet = new Pet();
        pet.name = "Rocky";

      //  pet.feeding();

        //   Pet.feeding();
        System.out.println(pet.name + " Pet is playing " + foodAmount);
    }

    public static void main(String[] args) {

        // feeding();
        play();
    }


}
