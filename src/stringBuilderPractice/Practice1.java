package stringBuilderPractice;

import java.util.Arrays;

public class Practice1 {
    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder("coding");
        System.out.println(builder);

        StringBuilder stringBuilder = new StringBuilder();

        System.out.println(stringBuilder);
        stringBuilder.append("coding2");
        System.out.println(stringBuilder);

        builder.append(" is cool");
        System.out.println(builder); // coding is cool

        String str = "coding";
        str.concat(" is fun");
        System.out.println(str); // coding

        builder = builder.append(" when it is SUNDAY");
        System.out.println(builder); //

        builder.append(builder);
        System.out.println(builder);

        System.out.println(builder.charAt(0));
        ;

        System.out.println(builder.length());

        System.out.println(builder.indexOf("g"));
        System.out.println(builder.charAt(builder.length() - 1));

        System.out.println(builder.lastIndexOf("Y"));

        System.out.println(builder.lastIndexOf("s"));

        System.out.println(builder.indexOf("ing"));

        builder = new StringBuilder("DESK");

        System.out.println(builder);

        builder.append(false);
        System.out.println(builder);
        builder.append(2.55);
        System.out.println(builder);

        // get the word 'false' from the builder object as a separate String

        String part = builder.substring(4, 9); // DESKfalse2.55

        System.out.println(part);

        // insert()

        builder.insert(4,"-Chair-");
        System.out.println( builder);

        builder.insert( builder.indexOf("-"), 500);
        System.out.println( builder);

        int[] numbers = {1,2,3,4,5,6,7};
        builder.insert(2, Arrays.toString(numbers));
        System.out.println( builder);

        System.out.println("----------------");
        //delete()

        builder.delete(10,40);
        System.out.println( builder);

        // deleteCharAt()

        builder.deleteCharAt(2);

        System.out.println(builder);

        builder.deleteCharAt(3);

        System.out.println(builder);
    }
}
