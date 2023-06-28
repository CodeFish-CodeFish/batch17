package objectPractice;

public class Employee {

    // instance variables
    String name;
    int age, employeeId;

    // methods
    public void work(){
        System.out.println("Employee is working");
    }

    // constructor

    public Employee(){
        System.out.println("NO param/argument CONSTRUCTOR");
    }

    public Employee(String name){
        this.name = name;
        System.out.println("ONE param/argument CONSTRUCTOR");
    }

    // create a const to init name and age of employee
   public Employee(String name, int age){

        this.name = name;
        this.age = age;
       System.out.println("TWO param CONSTRUCTOR");

    }


}
