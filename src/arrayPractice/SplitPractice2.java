package arrayPractice;

import java.util.Arrays;

public class SplitPractice2 {
    public static void main(String[] args) {

        String cactus = "Cactus spines are produced from specialized structures called areoles, a kind of highly reduced branch." +
                " Areoles are an identifying feature of cacti. As well as spines, areoles give rise to flowers, which are usually " +
                "tubular and multipetaled. Many cacti have short growing seasons and long dormancies and are able to react quickly " +
                "to any rainfall, helped by an extensive but relatively shallow root system that quickly absorbs any water reaching " +
                "the ground surface. Cactus stems are often ribbed or fluted with a number of ribs which corresponds to a number in " +
                "the Fibonacci numbers (2, 3, 5, 8, 13, 21, 34 etc). This allows them to expand and contract easily for quick water " +
                "absorption after rain, followed by retention over long drought periods. Like other succulent plants, most cacti " +
                "employ a special mechanism called \"crassulacean acid metabolism\" (CAM) as part of photosynthesis. Transpiration, " +
                "during which carbon dioxide enters the plant and water escapes, does not take place during the day at the same time " +
                "as photosynthesis, but instead occurs at night. The plant stores the carbon dioxide it takes in as malic acid, " +
                "retaining it until daylight returns, and only then using it in photosynthesis. Because transpiration takes place " +
                "during the cooler, more humid night hours, water loss is significantly reduced.";

        // find out words that has odd amount of letters from given string
        // are
        // surface

        //   cactus = cactus.replace(".", "").replace(",","").replace();


        String str = "";
        for (int i = 0; i < cactus.length(); i++) {

            if ((cactus.charAt(i) >= 'a' && cactus.charAt(i) <= 'z') ||
                    (cactus.charAt(i) >= 'A' && cactus.charAt(i) <= 'Z') || (cactus.charAt(i) == ' ')) {

                str += cactus.charAt(i);

            }
        }

        System.out.println(str);

        String[] split = str.split(" ");
        System.out.println(Arrays.toString(split));

        for ( String word  : split ){

            if (word.length() % 2 != 0){
                System.out.println( word);
                System.out.println(" ->"+  word.charAt(   word.length()/2   )   );
            }
        }
    }
}
