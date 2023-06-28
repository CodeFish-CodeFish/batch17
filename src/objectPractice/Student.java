package objectPractice;

import java.util.Random;

public class Student {

    String name, lastName;
    int id;

    // create a method to initialize 'name'
    public void setName(String name1){
        name = name1;
    }

    public void setLastName(String lastName1){
        lastName = lastName1;
    }

    // want to return name of student with method

    public String getName(){
        return name;
    }

    public String getLastName(){
        return lastName;
    }


    public int sleep() {
        int number = numberCreator();
        System.out.println("Student is sleeping for " + number + " hours");
        return number;
    }

    public int study() {
        int number = numberCreator();
        System.out.println("Student is studying for > " + number + " < hours");
        return number;
    }

    // create a method that will find out sum of study and sleep of student
    // check if the total is less than 10
    // tell student to study more

    public void sum() {

     int number =   study() + sleep();
     if (number < 10){

         System.out.println( name + " , you need to study more!!");
     }else {

         System.out.println("GOOD TO GO for the day");
     }

    }


    public int numberCreator() {

        Random random = new Random();

        int number = random.nextInt(12);

        return number;
    }

    public static void main(String[] args) {
        Student std1 = new Student();

        System.out.println(std1.numberCreator());

        std1.study();

        std1.sleep();


    }
}
