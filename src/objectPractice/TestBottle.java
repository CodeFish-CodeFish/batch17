package objectPractice;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TestBottle {
    public static void main(String[] args) {

        Bottle b1 = new Bottle("medium", "blue", "plastic", true);
        Bottle b2 = new Bottle("small", "blue", "glass", true);
        Bottle b3 = new Bottle("medium", "red", "glass", false);
        Bottle b4 = new Bottle("large", "white", "paper", false);
        Bottle b5 = new Bottle("medium", "blue", "paper", true);


        Bottle[] box = {b1, b2, b3, b4, b5};


        Bottle.checkBottle(box);

        System.out.println(Arrays.toString(  Bottle.checkBottle(box)));
    }
}
