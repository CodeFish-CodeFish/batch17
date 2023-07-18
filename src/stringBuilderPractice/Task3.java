package stringBuilderPractice;

public class Task3 {


    static StringBuilder clearingDashes(StringBuilder builder) {

        for (int i = 0; i < builder.length(); i++) {

            if (builder.charAt(i) == '-') {
                builder.deleteCharAt(i);   /// d-a-r-k c--ho-c---o-lat-e
                i--;
            }
        }

        return builder;
    }

    public static void main(String[] args) {
        StringBuilder b1 = new StringBuilder("da-r-k c--ho-c---o-lat-e");
        System.out.println(clearingDashes(b1));

        String str = "Interview";
        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {

            reversed +=  str.charAt(i);

        }

        System.out.println(reversed);

        StringBuilder b2 = new StringBuilder("Automation");

        b2.reverse();

        System.out.println(b2);

        StringBuilder b3 = new StringBuilder(str);

        String str2 = b3.reverse().toString();
        System.out.println(str2);


    }
}
