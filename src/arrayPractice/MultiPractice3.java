package arrayPractice;

public class MultiPractice3 {
    public static void main(String[] args) {
        /*
        {names of fruits}  "watermelon", "kiwi", "strawberry", "apple", "orange", "mango"
        { prices of fruits}    1.5   ,  0.5 ,  2.9    ,  0.75 ,  1.5  ,  2.25

        "Watermelon is $1.5 per lbs"
         */
        String[] fruitNames = {"watermelon", "kiwi", "strawberry", "apple", "orange", "mango"};
        double[] fruitPrices = {1.5, 0.5, 2.9, 0.75, 1.5, 2.25};

        for (int i = 0; i < fruitNames.length; i++) {

            // if (fruitNames[i].equalsIgnoreCase("watermelon"))
            System.out.println(fruitNames[i] + " is $" + fruitPrices[i] + " per lbs");

        }

        System.out.println("==============================");


        String[][] brands = {{"apple", "Dell", "HP", "Lenovo", "ACER"}, {"Samsung", "LG", "Sony"}, {"Alexa", "Google", "Siri", "Logitech", "JBL"}};

        double[][] prices = {{2500, 1900, 1800, 1100, 1600}, {2199, 1699, 1599}, {79, 89, 99, 69, 59}};


        for (int a = 0; a< brands.length; a++ ){

            for ( int b = 0; b< brands[a].length ; b++){
             //   if ( brands[a][b].equalsIgnoreCase("Samsung"))
                System.out.println( brands[a][b] + " is $"+ prices[a][b]);

            }
            System.out.println("-----------");

        }



    }
}
