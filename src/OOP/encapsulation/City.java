package OOP.encapsulation;

public class City {

    private long population;

    private int year;

    private String country;



    public void setPopulation(long population1){
      //  this.population = population;
        population = population1;
    }

    //get >> create method to return value of population
    public long getPopulation(){


        return population;
    }

    // set country and year for city

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    // get country and  year for city



}
