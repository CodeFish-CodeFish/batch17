package primitivePractice;

public class ComparisonPractice2 {

    public static void main(String[] args) {


        // event for kid is requiring age of 6 and up
        // "Can child attend: ...T/F "

        int requiredAge = 6, ageOfChild = 7;

        boolean result1 = ageOfChild >= requiredAge;

        System.out.println("Can child attend: " + result1);

        // event everybody is welcome except if the age is 18
        // "Can attend: ...T/F "
        int requiredAge2 = 18, ageOfPerson = 18;

        boolean result2 = ageOfPerson != requiredAge2;
        System.out.println("Can attend: " + result2);

        // event only people who are on age of 21 can attend

        int requiredAge3 = 21, ageOfPerson3 = 30;

        boolean result3 = requiredAge3 == ageOfPerson3;

        System.out.println("Can go in: " + result3);

        // task: if the name of student is Alex , he can answer
        //      "Alex is answering question ..."

        String name = "Alex", requiredName = "Alex";

        boolean result4 = name == requiredName;
        System.out.println("Alex is answering question: " + result4);

        // order lunch from store
        // delivery fee if your location is 5mi or more --> $5
        // print if you are paying fee or not

        int distance = 5, requiredDistance = 5;

        boolean result5 = distance >= requiredDistance;
        System.out.println("You need to pay $5 delivery fee: " + result5);

        boolean result55 = requiredDistance <= distance;
        System.out.println("You need to pay $5 delivery fee: " + result55);

        // event for kids only for
        // if the age is more than 6 and less than 12, they can attend
        // 10 >> "Your child can attend this special event ..T/F.."


        int age = 13, lowerLimit = 6, upperLimit = 12;


        boolean case1 = age >= lowerLimit;

        boolean case2 = age <= upperLimit;

        boolean result6 = case1 == case2;

        System.out.println("Your child can attend this special event: " + result6);


    }


}
