package arrayPractice;

public class Practice6 {

    public static void main(String[] args) {
        int[] numbers = {100, 12, 10, 35, 60, 12, 55};

        // find out average of given numbers

        // find the sum
        // divide sum by numbers of element

        int sum = 0;
        for (int i=0; i< numbers.length; i++){

            sum+= numbers[i];
            System.out.println("Sum : "+ sum);
        }
        System.out.println(   "The average is: "+ ( sum/ numbers.length ));




    }



}
