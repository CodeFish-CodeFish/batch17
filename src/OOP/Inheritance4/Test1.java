package OOP.Inheritance4;

public class Test1 {

    public static void main(String[] args) {

        Book book = new Book(100,"Reader","Mary");

        CookBook cookBook = new CookBook(111, "BEst Meals","Jake");


        book.read();

        cookBook.read();

        Book.pageCount = 900;
        CookBook.pageCount = 800;
        System.out.println( Book.pageCount);

        System.out.println( CookBook.pageCount);
    }
}
