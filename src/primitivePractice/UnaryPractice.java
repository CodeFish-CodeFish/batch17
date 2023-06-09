package primitivePractice;
public class UnaryPractice {
    public static void main(String[] args){


        int money = 12;
        System.out.println(money);
        // pre-increment
        System.out.println(   ++money ); // 13


        //pre-decrement
        System.out.println( --money ); // 12


        System.out.println("=======12=======");

        //post-increment
        System.out.println(  money++   ); // 12
        System.out.println(  money );//13

        // post-decrement
        System.out.println( money--); //

        System.out.println( money ); // 12
        System.out.println("==========12==========");
        money++;
        money++;
        System.out.println(money++); // 14
        System.out.println(money);// 15
        System.out.println("====================");


        int number = 5;

        int result = ++number + 10;
        System.out.println( result); // 16

        int count = 3;
        int result2 = count++ + 10;
        System.out.println("Result2 : "+result2); //13

        int result3 = count++ + 10;System.out.println( result3 ); // 14

        System.out.println("Count is now: " +count);
        count++;
        System.out.println(count++);//6, saves as 7
        count++; //saves as 8
        System.out.println( count++ );//shows 8, saves as 9


    }
}
