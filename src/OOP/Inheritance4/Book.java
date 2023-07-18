package OOP.Inheritance4;

public class Book {


    static int pageCount;
    String title;
    String author;


    public void read() {
        System.out.println("Reading book method");
    }




    public static void buy(){
        System.out.println("Buy Book"  );
    }





    public Book(int pageCount, String title, String author) {
        this.pageCount = pageCount;
        this.title = title;
        this.author = author;
    }

    public int getPageCount() {
        return 500;
    }
}
