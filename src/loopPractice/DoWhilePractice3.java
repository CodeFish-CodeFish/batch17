package loopPractice;

public class DoWhilePractice3 {
    public static void main(String[] args) {



        /*
        count numbers of Letters -print-> "There are ...6.. letters in the string"
        Count numbers of Digits --print-> "There are ...5.. digits in the string"
        Count numbers of symbols -print-> "There are ...3.. symbols in the string"
         */

        String str = "T56c*!!A&";
        int index = 0, letterCounter = 0, digitCounter = 0, symbolCounter = 0;

        do {

            char ch = str.charAt(index);

            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {

              //  System.out.println("I found a LETTER");
                letterCounter++;

                //   System.out.println("There are "+ letterCounter +" letters in the string");
            } else if (ch >= '0' && ch <='9') {
               // System.out.println("I found DIGIT");
                digitCounter++;
            }else {
               // System.out.println("I found Some other CHAR");
                symbolCounter++;
            }


            index++;
        } while (index < str.length());

        System.out.println("There are "+ letterCounter +" letters in the string");
        System.out.println("There are "+ digitCounter +" digits in the string");
        System.out.println("There are "+ symbolCounter +" other characters in the string");
    }
}
