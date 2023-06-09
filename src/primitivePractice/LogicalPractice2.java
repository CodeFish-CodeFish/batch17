package primitivePractice;

public class LogicalPractice2 {
    public static void main(String[] args) {

        // master program
        // 1- your GPA has to be more than 2.5
        // 2- your TOEFL score has to be more than 69
        // 3- you should have valid visa status
        // "Can take master course ..."

        double requiredGPA = 2.5, myGPA = 2.7, myTOEFL = 70, requiredTOEFL = 69;
        boolean visa = true, myVisa = true;

        boolean master = myGPA > requiredGPA && myTOEFL > requiredTOEFL && myVisa == visa;
        System.out.println("Can take master course " + master);

        System.out.println("====================");

        // java course --> test1 - 65 test2  - 80  test3 - 100
        // when your average score is more than 80
        // your attendance score is more than 80
        // you will pass the class
        // if your average is above class average ---55---, you can pass

        int test1 = 65, test2 = 80, test3 = 50, requiredAverage = 80, myAverage, requiredAttendance = 80, myAttendance = 40, classAverage = 55;

        myAverage = (test1 + test2 + test3) / 3;

        System.out.println("Pass the class >> " + ((myAverage > requiredAverage && myAttendance > requiredAttendance) || myAverage > classAverage));

        boolean b1 = (myAverage > requiredAverage && myAttendance > requiredAttendance);

        boolean result = b1 || myAverage > classAverage;
        System.out.println("Pass 2 " + result);

        String str = " adfgadg";


    }
}
