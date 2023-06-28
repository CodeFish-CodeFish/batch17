package objectPractice;

public class AnimalTest {


    public static void main(String[] args) {


        Animal capybara = new Animal();

        System.out.println(capybara.age);
        capybara.age = 3;
        System.out.println(capybara.age);
        System.out.println(capybara.name);
        capybara.name = "sweet";
        capybara.color = "brown";
        System.out.println(capybara.name);
        System.out.println(capybara.color);
        System.out.println("=================");
        // create another animal and initialize instance variables
        // then print values of variables out
        Animal lion = new Animal();
        lion.color = "Golden";
        lion.age = 2;
        lion.name = "Simba";

        System.out.println(lion.color);
        System.out.println(lion.name);
        System.out.println(lion.age);

        String str = new String("Summer");

        lion.eat();
        capybara.eat();

        Animal tiger = new Animal();
        tiger.run();
        System.out.println(tiger.name); // null since we did not initialize name for tiger yet
        tiger.name = "Leo";
        // Leo is running
        // sweet is running
        // Simba is running
        System.out.println("===============");
        capybara.run();
        lion.run();
        tiger.run();
        System.out.println("===============");
        capybara.eat();
        tiger.eat();
        lion.eat();
        System.out.println( capybara.energyLevel);
        System.out.println( lion.energyLevel);
        System.out.println( tiger.energyLevel);
        System.out.println("=====================");
        Animal bird = new Animal();
        System.out.println( bird.name  );  // Riko
        System.out.println( bird.color);
        System.out.println( bird.age);
        System.out.println( bird.energyLevel);

        // create a method to show all information of any animal object
        // call your newly created method to check if it works as it should.

    }

}
