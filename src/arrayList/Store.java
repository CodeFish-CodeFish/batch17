package arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Store {

    /*
    -create a method to find the cheapest computer
	method should take arraylist as parameter
	method should return that cheapest computer
     */

   static public Double cheapestPrice(List<Computer> listOfComputers) {

        Double cheapest = listOfComputers.get(0).price;

        for (Computer computer : listOfComputers) {

            if (cheapest > computer.price) {
                cheapest = computer.price;

            }
        }

        return cheapest;
    }
    static public Computer cheapestComp(List<Computer> listOfComputers) {
        Computer c1 = listOfComputers.get(0);
        Double cheapest = listOfComputers.get(0).price;

        for (Computer computer : listOfComputers) {

            if (cheapest > computer.price) {
                cheapest = computer.price;
                c1 = computer;
            }
        }

        return c1;
    }

    // create a method that will return computers
    // which has screen size between  15 inch and 18 inches

    public static List<Computer> largerScreenFinder(List<Computer>   computerList){

       List<Computer> list = new ArrayList<>();

       for (Computer computer : computerList){

           if (computer.screenSize >=15 && computer.screenSize<=18){
               list.add(computer);
           }
       }

       return list;

    }



public static void priceMatcher(Computer computer, Phone phone ){

       if (computer.price == Double.parseDouble(phone.price)){

           System.out.println("BINGO");
       }else {
           System.out.println("Prices are different!");
       }


}



    public static void main(String[] args) {
        Computer d1 = new Computer("Apple", "PRO", 2200d, 17d);
        Computer d2 = new Computer("HP", "Envy", 1250.99, 15.5);
        Computer d3 = new Computer("Apple", "AIR", 799.50, 11.5);
        Computer d4 = new Computer("LENOVO", "TECH", 1100d, 13.5);

        List<Computer> list = new ArrayList<>();
        list.add(d1);
        list.add(d2);
        list.add(d3);
        list.add(d4);

        Double price = cheapestPrice(list);
        System.out.println( price);

        Computer cc = cheapestComp(list);
        System.out.println(cc);
        System.out.println("===========");

        System.out.println( largerScreenFinder(list) );

        System.out.println("===========");

        Computer computerDevice = new Computer("Java", "Selenium", 1200.0,11.5);

        Phone phone = new Phone("ABCD", "XYZ","200.0", "128");

        priceMatcher(computerDevice, phone);



    }
}
