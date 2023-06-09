package loopPractice;

public class WhilePractice1 {
    public static void main(String[] args) {

        System.out.println("Wednesday is the best");
        System.out.println("Wednesday is the best");
        System.out.println("Wednesday is the best");
        System.out.println("Wednesday is the best");
        System.out.println("Wednesday is the best");
        System.out.println("Wednesday is the best");
        System.out.println("Wednesday is the best");
        System.out.println("Wednesday is the best");
        System.out.println("Wednesday is the best");
        System.out.println("Wednesday is the best");
        System.out.println("Wednesday is the best");
        System.out.println("=====================");

        int number = 1;


        while (number <= 10) {

            System.out.println("****Wednesday is the best**");

            number++;
        }

        // "Java is the best coding Language" --> for 5 times
        number = 1;
        while (number <= 5) {

            System.out.println("Java is the best coding Language");

            ++number;
        }
        System.out.println(number);
        System.out.println("++++++++++++++++++++++");


        while ( number <11){
            System.out.println("---Java is the best coding Language---");
            number++;
        }

        System.out.println("++++++++++++++++++++++");

        number =11;
        while ( number > 6 ){
            System.out.println("--///-Java is the best coding Language-//--");
            number--;
        }

        int a = 5;
//          the following loop is called infinite loop since it does not stop
//        while ( a == 5){
//
//            System.out.println("*******");
//
//        }

    }
}
