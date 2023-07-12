package blockPractice;

public class Test1 {
    public static void main(String[] args) {


        BlockPractice obj1 = new BlockPractice();
        BlockPractice obj2 = new BlockPractice();
        BlockPractice obj3 = new BlockPractice();

        System.out.println(obj3.day);

        System.out.println( BlockPractice.food);
        System.out.println( obj1.food);
        obj1.food = 22;
        System.out.println( obj3.food);

        obj1.day = "Thursday";
        System.out.println( obj3.day);
    }
}
