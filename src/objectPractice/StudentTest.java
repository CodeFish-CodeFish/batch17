package objectPractice;

public class StudentTest {
    public static void main(String[] args) {

        Student student1 = new Student();

        System.out.println(student1.name);
        System.out.println(student1.lastName);
        System.out.println(student1.id);


        student1.id = 99;
        System.out.println(student1.id);


        student1.id = student1.numberCreator();

        System.out.println("Student id after getting from numberGenerator method >> " + student1.id);

        student1.sleep();
        System.out.println();
        System.out.println("======================");


        student1.sum();


        System.out.println();
        System.out.println("======================");

        System.out.println(student1.name);
        student1.setName("Alex");
        System.out.println(student1.name);

        student1.setLastName("Smith");
        System.out.println(student1.lastName);

        System.out.println();
        System.out.println("======================");

        System.out.println(student1.getName());

        System.out.println( student1.getLastName());

    }
}
