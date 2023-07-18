package stringBuilderPractice;

public class Task1 {
    public static void main(String[] args) {
        /*
        -create a method
		-parameter --> StringBuilder
		-finding sum of digit from string builder
		-return the sum as double
		"SDer45SD&^&34" --> 4+5+3+4 ==> 16
         */
        StringBuilder bldr = new StringBuilder("SDer45SD&^&34");
     double total =    totalFinder2(bldr);
        System.out.println( total);

    }

    private static Double totalFinder(StringBuilder builder){
        Double sum = 0d;
        for (int i=0; i< builder.length(); i++){

            if ( builder.charAt(i) >= '0' && builder.charAt(i) <='9'){

                sum += Double.parseDouble(String.valueOf(builder.charAt(i)));
            }

        }
        return sum;
    }

    private static Double totalFinder2(StringBuilder builder){
        Double sum = 0d;
        for (int i=0; i< builder.length(); i++){

            if (Character.isDigit(builder.charAt(i))){

                sum += Double.parseDouble(""+builder.charAt(i));
            }

        }
        return sum;
    }









}
