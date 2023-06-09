package primitivePractice;
public class CastingPractice {
    public static void main(String[] args){

        long l1  = 45;

     //   int i1 = l1; // bc of numeric promotion it does not allow u to store
        int i1 = (int)l1; // by Casting you can store larger data type into smaller data type

      //  int i2 = 5.4; // compile time error

        int i2 = (int)5.9;

        System.out.println( "i2 --> "+ i2); // 5

        System.out.println( i2 + i2 * 2); // 15

        double d1 = 7.8 + 1;
        System.out.println( d1); // 8.8

        i1 =  (int)d1;
        System.out.println(i1);

        //=====================

        byte b1 = 4, b2 = 5;

        byte result =  (byte)( b1 * b2) ;
        System.out.println( result); //20

        short result2 =  (short) ( b1 * b2) ;

        //compound assignment
        // when you use compound assignment it will cast the result automatically
        result += 5.4; // result = result + 5.4;

        System.out.println( "Result after casting with compound assignment "+ result);
        // source    -- target
        //(int)5.6   --> 5

        float f1 = 9.8f, f2 = 6.5F;

        float result3 = f1 - f2;
        System.out.println("result3 "+ result3);


        long l2 = 129;
        short sh3 = (short)l2;

        byte b4 = (byte)l2;

        System.out.println(b4);


    }
}
