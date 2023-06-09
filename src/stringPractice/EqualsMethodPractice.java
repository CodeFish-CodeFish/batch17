package stringPractice;

public class EqualsMethodPractice {

    public static void main(String[] args) {

        String name1 = "David";

        String name2 = "David";

        System.out.println(  name1.equals(name2)   );

        System.out.println(   name1 == name2 );
        System.out.println("---------------------");

        String name3 = new String("David");

        System.out.println(name1.equals(name3));
        System.out.println( name1 == name3);
        System.out.println("---------------------");

        String name4 = new String("David");

        System.out.println( name2.equals(name4)  );
        System.out.println( name3 == name4);
        System.out.println("---------------------");

        String name5 = name1;
        System.out.println( name1.equals(name5));
        System.out.println( name5 == name1);
        System.out.println("---------------------");

        String name6 = name3;
        System.out.println( name6.equals(name3));

        System.out.println( name6 == name3);



    }
}
