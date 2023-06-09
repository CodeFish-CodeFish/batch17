package stringPractice;

public class MethodChaining {
    public static void main(String[] args) {


        String str = " it is raining outside";

       int number =  str.toUpperCase().concat(" but it was sunny yesterday").replace('i', '-').length();

        System.out.println(number);

        str = str.toUpperCase().concat(" but it was sunny yesterday").replace('I', '-');
        System.out.println(str);
        str = str.trim().toUpperCase().concat(" but it was sunny yesterday").replace('I', '-');
        System.out.println(str);

    }
}
