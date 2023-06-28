package objectPractice;

public class Cat {

    String name, color;
    char gender;
    int age;

    public  void walk(String destination ){

        System.out.println(name + " is walking to " + destination);
    }
    /*
    -create another method
		it will take a parameter for numbers of miles and destination
		this method will show:
			"..name. is going to ..dest.. for ..miles.. miles"
		this method will return amount of calories that cat burned
		-100 calories per mile

	-check if your newly created method works
     */

    public int calorieCalculator(int miles, String destination ){

        System.out.println(name + " is going to "+ destination + " for " + miles + " miles.");

        int cal = miles * 100;

        return cal;
    }


}
