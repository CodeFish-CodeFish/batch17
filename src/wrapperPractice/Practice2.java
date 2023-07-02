package wrapperPractice;

public class Practice2 {
    public static void main(String[] args) {

        String str = "245twerg 6*&4sg 45@";

        // from given string find out digits only

        for (int i = 0; i < str.length(); i++) {


            if (Character.isDigit(str.charAt(i))) {

                System.out.println(str.charAt(i));
            } else if (Character.isAlphabetic(str.charAt(i))) {
                System.out.println(">> " + str.charAt(i) + " << ");
            } else if (Character.isSpace(str.charAt(i))) {
                System.out.println("___________");
            } else {
                System.out.println("** " + str.charAt(i) + " **");
            }

            //str.charAt(i)
        }


    }
}
