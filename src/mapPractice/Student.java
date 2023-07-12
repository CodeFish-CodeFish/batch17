package mapPractice;

public class Student {

    String  name, address, age, id;

    public Student(String name, String address, String age) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.id = idCreator();
    }


    public String idCreator(){

    //    Integer id = (int)(Math.random() * 1000_000);
     return  ""+  (int)(Math.random() * 1000_000) ;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age='" + age + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
