package loopPractice;

import java.util.Arrays;

public class ForEachPractice3 {
    public static void main(String[] args) {


        String[] employees = {"Mike", "David", "sam", "SArah", "ALEX", "Natalie"};
        // create e-mail address for each employee
        // mike@gamil.com, david@gmail.com ...
        // store email address to another array
        // from emails array --> send a welcome e-mail to 'Alex' --> "Hi Alex, welcome aboard!"

        for (String employee : employees) {

            System.out.println(employee.toLowerCase().concat("@gmail.com"));

        }
        System.out.println("---------------------");
        String[] emails = new String[employees.length];
        int index = 0;
        for (String employee : employees) {

            emails[index] = employee.toLowerCase().concat("@gmail.com");
            index++;
        }
        System.out.println(Arrays.toString(emails));
        // from emails array --> send a welcome e-mail to 'Alex' --> "Hi Alex, welcome aboard!"

        for ( String email : emails){

            if (email.startsWith("alex")){ // [mike@gmail.com, david@gmail.com, sam@gmail.com, sarah@gmail.com, alex@gmail.com, natalie@gmail.com]
                System.out.println("Sending email to this address >> "+ email);
                System.out.println("Hi Alex, welcome aboard!" );
            }
        }

        for (String name : employees){

            if (name.length() <=4){
                System.out.println( name.toLowerCase().concat("@gmail.com"));
            }else {
                System.out.println( name.toLowerCase().concat("@yahoo.com"));
            }
        }

    }
}
