package objectPractice;

public class EmployeeTest {
    public static void main(String[] args) {

        // create an Employee object

        Employee e1 = new Employee();

        System.out.println( e1.name);

        Employee e2 = new Employee("Alex");
        System.out.println( e2.name );

        Employee e3 = new Employee(" David", 20);

        e1.work();
        e2.work();
        e3.work();


    }
}
