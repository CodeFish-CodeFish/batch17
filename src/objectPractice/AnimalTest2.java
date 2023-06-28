package objectPractice;

public class AnimalTest2 {

    public static void main(String[] args) {

        // creating object from animal class
        Animal bird = new Animal();
        bird.allInfo();
        System.out.println(bird); //
        bird.run();
        System.out.println(bird.energyLevel);
        bird.run();
        bird.run();
        bird.run();
        bird.run();
        bird.run();
        bird.run();
        bird.run();
        bird.run();
        bird.run();
        bird.run();
        // charge up bird to 100 when it eats
        bird.eat();
        System.out.println(bird.energyLevel);

        System.out.println("=====FISH======");
        Animal fish = new Animal();
        fish.allInfo();



    }


}
