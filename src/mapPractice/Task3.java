package mapPractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Task3 {

    public static void main(String[] args) {


        HashMap<String, String > e1 = new HashMap();
        HashMap<String, String > e2 = new HashMap();
        HashMap<String, String > e3 = new HashMap();

        e1.put("firstName", "David");
        e1.put("lastName","Pena");
        e1.put("gender", "M");
        e1.put("age", "25");
        e1.put("city", "Chicago" );

        e2.put("firstName", "Jerry");
        e2.put("lastName","Smith");
        e2.put("gender", "M");
        e2.put("age", "15");
        e2.put("city", "HighPark" );

        e3.put("firstName", "Michael");
        e3.put("lastName","White");
        e3.put("gender", "M");
        e3.put("age", "35");
        e3.put("city", "Winnetka" );


        List<HashMap<String , String >> list = new ArrayList<>();

        list.add(e1);
        list.add(e2);
        list.add(e3);

    }

    public  static void ageChecker(List<HashMap <String, String >> listOfEmployees){





    }



}
