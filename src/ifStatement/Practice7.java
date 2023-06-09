package ifStatement;

import java.util.Scanner;
import java.util.SimpleTimeZone;

public class Practice7 {
    public static void main(String[] args) {
        /*
            Let's say there is a candidate for a job interview and s/he will be asked abut java, selenium, API, SQL knowledge
        first ask candidate if s/he knows java
          if s/he says 'yes' --> ask about selenium knowledge
            if s/he says 'yes' --> ask about API testing
              if s/he says 'yes' --> ask about SQL knowledge
               "Congrats! You are hired"
                if s/he says 'no' --> we need SQL knowledge
              if s/he says 'no' --> "We need API knowledge"
            if s/he says 'no' --> "We need selenium skills"
          if s/he says 'no' --> "please learn java and try again"
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("welcome! \nDo know Java?");
        String java = scanner.nextLine();

        if (java.equalsIgnoreCase("YES")) {
            System.out.println("Do you know Selenium? yes/no");
            String selenium = scanner.nextLine();

            if (selenium.equalsIgnoreCase("yes")) {

                System.out.println("Do you know API testing");
                String api = scanner.nextLine();
                if (api.equalsIgnoreCase("yes")) {
                    System.out.println("Do you know SQL");
                    String sql = scanner.nextLine();

                    if (sql.equalsIgnoreCase("Yes")) {
                        System.out.println("!!!YOU ARE HIRED!!!");
                    } else {
                        System.out.println("Sorry, we need someone with SQL knowledge");
                    }

                } else {
                    System.out.println("Sorry, We need API knowledge");
                }

            } else {
                System.out.println("Sorry, we need Selenium knowledge");
            }

        } else {

            System.out.println("Sorry, we need someone with Coding Language Knowledge");
        }



    }
}
