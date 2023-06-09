package switchPractice;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter an integer value for a day name");
        int day = scanner.nextInt();

        switch (day){

            default:
                System.out.println("Your entry is not Valid");break;
            case 1 :
                System.out.println("Monday");break;
              // you cannot have duplicate cases with same value
//            case 1 :
//                System.out.println();
            case 2 :
                System.out.println("Tuesday"); break;
            case 3 :
                System.out.println("Wednesday");break;
            case  4:
                System.out.println("Thursday"); break;
            case 5 :
                System.out.println("Friday");
                break;
        }
    }
}
