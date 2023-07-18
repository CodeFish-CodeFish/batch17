package stringBuilderPractice;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {

        StringBuilder b1 = new StringBuilder("aba");
        StringBuilder[] array = {b1, new StringBuilder("Test"), new StringBuilder("Alex"), new StringBuilder("ana")};
        System.out.println(replacer(array));
    }

    static public List<StringBuilder> replacer(StringBuilder[] stringBuilders) {

        List<StringBuilder> result = new ArrayList<>();

        for (StringBuilder element : stringBuilders) {

            if (element.charAt(0) == 'a' || element.charAt(0) == 'A' && element.length() >= 3) {
                //  StringBuilder str = new StringBuilder();
                element.replace(element.length() / 2, element.length() / 2 + 1, "*");
                result.add(element);
            }
        }

        return result;

    }


}
