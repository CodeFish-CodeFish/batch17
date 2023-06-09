package switchPractice;

import java.util.Scanner;

public class Practice4 {
    public static void main(String[] args) {

        /*
        IT - 1
                "Alex", "David"
                "You are speaking with Alex"
                "You are speaking with David"
                -default-
        HepDesk -2
                >> Anna, Robert
                "Anna is on the phone"
                ...
        HR - 3

            -Molly, Vlad, Victoria

        Finance - 4
               Tima
        -default-
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please select from following departments... Press" +
                "\n1 -- for -- IT\n2 -- for -- HelpDesk\n3 -- for -- HR\n4 -- for -- Finance");

        int department = scanner.nextInt();
        scanner.nextLine();

        //scanner = new Scanner(System.in);

        switch (department) {
            case 1:
                System.out.println("Who do you want to speak with? Alex/David");
                String name = scanner.nextLine().toLowerCase(); // alex

                switch (name) {
                    case "alex":
                        System.out.println("You are speaking with " + name);
                        break;
                    case "david":
                        System.out.println("You are speaking with " + name);
                        break;
                    default:
                        System.out.println("No such a person!");
                        break;
                }
                break;
            case 2:
                System.out.println("You are in HelpDesk");
                System.out.println("Who do you want to speak with? Anna/Robert");

                String name1 = scanner.nextLine().toLowerCase();
                switch (name1) {

                    case "anna":
                        System.out.println("You are speaking with " + name1);
                        break;
                    case "robert":
                        System.out.println("You are speaking with " + name1);
                        break;
                    default:
                        System.out.println("No such a person!");
                        break;
                }

                System.out.println("Thanks for choosing HelpDesk");
                break;
            case 3:
                System.out.println("You are in HR");
                System.out.println("Who do you want to speak with? Molly/Vlad/Victoria");

                String name2 = scanner.nextLine().toUpperCase();

                switch (name2) {
                    case "MOLLY":
                    case "VLAD":
                    case "VICTORIA":
                        System.out.println("You are speaking with " + name2);
                        break;
                    default:
                        System.out.println("No such a person!");
                        break;
                }
                break;
            case 4:
                System.out.println("You are in FINANCE");
                System.out.println("You are speaking with TIMA");
                break;
            default:
                System.out.println("There is No such Department that is selected");
                break;

        }
    }
}
