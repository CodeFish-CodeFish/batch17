package mapPractice;

import java.util.HashMap;

public class StudentTest {

    public static void main(String[] args) {

        Student s1 = new Student("Mike","123 main st", "12");
        Student s2 = new Student("Vlad","111 brown st", "30");
        Student s3 = new Student("Alex","100  east ct", "21");
        Student s4 = new Student("Aida","300 w down st", "25");

        System.out.println( s1.id);

        HashMap < String , Student > studentMap = new HashMap();

        studentMap.put(s1.id, s1);
        studentMap.put(s2.id, s2);
        studentMap.put(s3.id, s3);
        studentMap.put(s4.id, s4);

        System.out.println(  studentMap.get(s1.id));

        System.out.println( studentMap);

        printNamesOfStudents(studentMap);
        System.out.println("=========");
        printIdsOfStudents(studentMap);
        System.out.println("=========");
        printStudent(studentMap);
    }

    public static void printNamesOfStudents(HashMap<String , Student  >   map){

        //map.values()

        for ( Student student  : map.values() ){

            System.out.println( student.name);
        }

    }

    // create a method to print all student ids from map
    public static void printIdsOfStudents(HashMap<String , Student  >   map){

//        for ( Student student  : map.values() ){
//
//            System.out.println( student.id);
//        }

        System.out.println( map.keySet());
    }

    // create a method to print each student by using their ids in get() method as key

    public static void printStudent(HashMap<String , Student  >   map){

//        for ( Student  st: map.values()){
//        System.out.println(  map.get(st.id)  );}

        for (  String id  : map.keySet()){

            System.out.println( map.get(id));
        }

    }






}
