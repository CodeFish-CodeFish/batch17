package objectPractice;
public class MethodPractice1 {
    /*
    create method that will take name of person and birth year
    method will calculate age of person and return it
    also - it prints >> " ..Alex.. you are ...20.. years old"
     */

    public int ageCalculator( String nameOfPerson, int birthYear ){
        int age = 2023 - birthYear;
        System.out.println(nameOfPerson +", you are "+ age+" years old");
        return age;
    }

    //overload ageCalculator method
    public int ageCalculator( ){
        System.out.println("Given age is always 6");
        return 6;
    }



    //overload ageCalculator method
    public void ageCalculator(int birthYear){

        System.out.println("Your age is > "+ (2023 - birthYear));
    }

    public int ageCalculator(double birthYear){

        System.out.println("Your age is > "+ (2023 - birthYear));
        return 5;
    }

    public int ageCalculator(String birthYear){

        System.out.println("Your age is > ");

        return 9;
    }









    public static void main(String[] args) {

        MethodPractice1 pr1 = new MethodPractice1();
        pr1.ageCalculator("Alex", 1900);

        pr1.ageCalculator("John", 1990);

        int ageForSam = pr1.ageCalculator("Sam", 2020);

        System.out.println(   pr1.ageCalculator("Sarah", 1980)   );

        System.out.println("----------Overloading ------------------");
        pr1.ageCalculator(); // this method will always give 6

        pr1.ageCalculator(2015);

        pr1.ageCalculator("Vlad", 2013);

        pr1.ageCalculator("STringString");

        System.out.println("----------Overloading ---------^^^^---------");
        String str = "Test";

        str.substring(1);
        str.substring(1,3);


    }

}
