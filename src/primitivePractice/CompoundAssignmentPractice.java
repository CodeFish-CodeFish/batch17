package primitivePractice;

public class CompoundAssignmentPractice {
    public static void main(String[] args) {
        // +=, -=, *=, /=, %=

        int studentNumber = 25;
        System.out.println(studentNumber); //25

        studentNumber = studentNumber + 1;

        System.out.println("Student >> "+studentNumber);// 26

        int count = studentNumber + 1; // ;
        System.out.println( count); //
         count += 5;
        System.out.println( "Count >> "+count);
        count += studentNumber; // compound -->  count = count + studentNumber;
        System.out.println( count );

        System.out.println("-------------");

        count /= 2; // count = count / 2;
        System.out.println(count);

        count %= studentNumber; // count = count % studentNumber;
        System.out.println("Count is: "+ count ); // 3, 6,

        int number1 = 19 , number2 = 5;

        number1 %= number2;
        System.out.println( "Number1 is: "+ number1); //4

        number1 *= count + count; // number1 = number1 * ( count + count)
        System.out.println( "Number1 is: "+ number1 ); // 24, 15,



    }
}
