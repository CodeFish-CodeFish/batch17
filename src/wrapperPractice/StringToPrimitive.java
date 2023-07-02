package wrapperPractice;

public class StringToPrimitive {
    public static void main(String[] args) {

        // parse , valueOf


        String strNumber = "111";

        // want to add 10 more on top of number
        System.out.println(strNumber + 10); // 11110
        int number = Integer.parseInt(strNumber);

        System.out.println(number + 10); //
        // Autoboxing: when you convert a primitive to wrapper class object
        Integer i = number;
        System.out.println("i >> " + i);

        Integer number1 = Integer.parseInt(strNumber);// bc of autoboxing, you can
        // store parsed value from string to wrapper class object directly


        Integer i1 = Integer.valueOf(9);

        String str2 = "5";

        Integer i2 = Integer.valueOf(str2.charAt(0));

        System.out.println(i2);

        //  System.out.println( Integer.parseInt(str2) );

        double d = 2.5;

        Double number3 = Double.valueOf(d);
        System.out.println(number3 + 100);


        // use toString() method to convert wrapper class object to String
        // toString()

        String strDouble = number3.toString();
        System.out.println(strDouble + 100);

        // casting

    }
}
