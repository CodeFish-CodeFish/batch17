package objectPractice;

public class TestCat {
    public static void main(String[] args) {


        Cat cat = new Cat();
        cat.name = "TOM";
        cat.color = "White-Blue";
        cat.gender = 'M';
        cat.age = 12;

        cat.walk("park");

        cat.calorieCalculator(5, "down");

        System.out.println( cat.calorieCalculator(5, "down")    );

        int day1 = cat.calorieCalculator(4, "beach");
        int day2 = cat.calorieCalculator(3, "south park");

    }
}
