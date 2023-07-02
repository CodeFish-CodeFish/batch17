package objectPractice;

public class TestPet {
    public static void main(String[] args) {
        Pet pet1 = new Pet();
        System.out.println( pet1.name );
        System.out.println( pet1.foodAmount);

        System.out.println("==========");
        Pet pet2 = new Pet();
        System.out.println( pet2.foodAmount);
        pet1.name = "Tom";
        pet2.name = "Ginger";
        System.out.println("==========");
        pet1.feeding();
        pet1.feeding();
        pet1.feeding();

        pet2.feeding();
        pet2.feeding();

        System.out.println("==========");

        pet1.play();

        // static methods can be called with class name
        Pet.play();



    }
}
