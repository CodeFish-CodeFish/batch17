package wrapperPractice;

public class Practice1 {
    public static void main(String[] args) {

        Byte b = 3;

        byte b1= 7;

        Byte bb = new Byte(b1);

        System.out.println( bb );

        short sh1 = 2;
        Short sh = new Short(sh1);

        Integer number = new Integer(4);

        Integer number2 = new Integer(sh);
        System.out.println( number2 * sh + number / 3 + number);



        Character letter = 'r';
        Character letter2 = new Character('W');
        System.out.println( letter + letter2);
        //auto boxing
        Integer number3 = 4;
        int a = 9;
        number3 = a;
        System.out.println( a == number3 );

        //unboxing
        Integer number5 = new Integer(9);
        int num = number5;
        System.out.println(num);
        System.out.println(number5);


















    }



}
