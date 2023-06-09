package primitivePractice;

public class UnaryPractice2 {
    public static void main(String[] args) {

        int apple = 8 ;

        int bucket = apple++   +    ++apple;
        System.out.println( bucket ); // 18
        System.out.println( apple );

        System.out.println("==========");

        int burger = 15, drink = 8;


        int total = 5 +    ++burger +    --drink  +   10  -  3;

        System.out.println( total); // 35

        System.out.println( ++burger + ++burger + burger++); //  53

        System.out.println( "Burger is "+ burger);

        System.out.println("Drink is >> "+ drink);
        int result = drink-- / 5   +    drink--    *     2;
        System.out.println("Result "+ result--); // 13,
        System.out.println(result);






    }
}
