package arrayPractice;

public class VarArgPractice {
    public static void main(String[] args) {

        VarArgPractice object1 = new VarArgPractice();
        int[] ids = {1, 2, 3};
        object1.findingSum(ids);

        object1.sumFinder2(1, 2, 3);
        object1.sumFinder2(10, 10, 10, 10, 10);
        object1.namePrinter("Moldir","ALex","Sam");
    }
    // "tenev", "smith", "jake" ...
    // 1. tenev
    // 2. smith
    // .....

    public void namePrinter( String... names) {

//        int num = 0;
//        for (String name : names) {
//
//            num++;
//            System.out.println( num +". "+ name);
//
//        }

        for (int i=0; i< names.length; i++){
            System.out.println(i+1 + ". "+names[i]);
        }

    }


    // create a method to find sum of numbers from an array and return it
    // {1,2,3} 1+2+3 --> 6


    public void sumFinder2(int... numbers) {

        int sum = 0;

        for (int id : numbers) {
            sum += id;
        }
        System.out.println("Sum is: " + sum);

    }


    public String findingSum(int[] ids) {

        int sum = 0;

        for (int id : ids) {
            sum += id;
        }
        System.out.println("Sum is: " + sum);
        return "" + sum;
    }


}
