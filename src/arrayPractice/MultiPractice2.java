package arrayPractice;

import java.util.Arrays;

public class MultiPractice2 {
    public static void main(String[] args) {

        String[][] cities = {   { "LA", "Sacramento", "San Diego"}  , { "Chicago","Springfield","Nashville" } , { "Boston", "Miami","New York","Washington"}       };


        System.out.println(Arrays.deepToString(cities));

        System.out.println( cities.length); // 3

        System.out.println( cities[0].length); // 3

        // reach out every city name
        //if the name of city is 'miami'
        // "it is usually hot over there"

        for ( int i=0; i< cities.length; i++  ){
            for ( int k = 0; k < cities[i].length ; k++){
                if ( cities[i][k].equalsIgnoreCase("miami") ){
                    System.out.println("it is usually hot over there >> " +cities[i][k] );
                }
            }
        }

        System.out.println("----------------------");

        for ( String[] cityArray : cities   ){

            for ( String city : cityArray ){

                if ( city.equalsIgnoreCase("MIAMI")){
                    System.out.println("it is usually hot over there -- " + city);
                }
            }
        }
    }
}
