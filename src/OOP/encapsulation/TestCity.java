package OOP.encapsulation;

public class TestCity {


    public static void main(String[] args) {


        City city = new City();

        city.setPopulation(3565801);

        System.out.println( city.getPopulation());

        City city2 = new City();

        System.out.println( city2.getPopulation());

        city.setCountry("USA");

        System.out.println( city.getCountry());





    }
}
