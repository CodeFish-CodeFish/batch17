package blockPractice;

public class BlockPractice {
   String day;
    static int food;

    // instance block
    {
        day = "Tuesday";
        System.out.println("Instance block");
    }


    // static block
    static {

        System.out.println( "***");
    }
    static {
        food = 11;
        System.out.println("Static Block");
    }



}
