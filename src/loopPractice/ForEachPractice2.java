package loopPractice;

public class ForEachPractice2 {
    public static void main(String[] args) {

        String[] flowers = {"lily", "rose", "tulip", "daisy", "orchid","cactus","peony","Camellia"};

        // print every flower name as UpperCase by using for each loop
        // LILY
        // ROSE
        //  if the flower name is starting with letter 'c' or 'C'
        // print --> this is my favorite from now on...
        for ( String flower : flowers ){

            System.out.println(  flower.toUpperCase()   );

            if ( flower.startsWith("c") || flower.startsWith("C")){
                System.out.println("this is my favorite from now on.. >> " + flower);
            }


        }












    }
}
