package objectPractice;

public class MicrophoneTest {

    public static void main(String[] args) {
        Microphone m1 = new Microphone();

        Microphone m2 = new Microphone("Insignia");

//        System.out.println( m1.wired); // false
//
//        System.out.println( m2.wired); // false

        System.out.println("=========================");
        Microphone m3 = new Microphone("Black","Sony", true, 50);

        System.out.println( m3.brand );
        System.out.println( m2.brand  );
        System.out.println( m1.brand  );

        System.out.println("=========================");

        Microphone  m4 = new Microphone(true, 99, "SHURE");
        System.out.println( m4.brand );
        System.out.println( m1.brand );
        System.out.println( m2.brand );
        System.out.println( m3.brand );


        System.out.println("---------------------");

        System.out.println( m4 );

        System.out.println( m1 );
        System.out.println("---------------------");



     //   m4.printInfo();

        System.out.println(   m1 == m2);

        System.out.println( m1 == m4);

        System.out.println(  m1.equals( m2 )    );

        Microphone m11 = new Microphone();

        System.out.println(   m1 == m11);

        System.out.println( m1.equals(m11));

        System.out.println("++++++++++++");

        m11 = m1;
        System.out.println(   m1 == m11);

        System.out.println( m1.equals(m11));

        System.out.println("++++++++++++");

        System.out.println( m2);
        m2 = null;

        System.out.println(m2);
     //   System.out.println( m2.brand);

        m4 = null;
        //garbage
        System.gc();

    }
}
