package OOP.Inheritance4;

public class CookBook extends Book{

    public CookBook(int pageCount, String title, String author) {
        super(pageCount, title, author);
    }


    public void read(){
        System.out.println("Reading in COOK BOOK");
    }


    public static void buy(){
        System.out.println("Buy Cook Book from WM");
    }


    public static void main(String[] args) {

        Book b1 = new Book(200, "JAVA", "EFE");

        System.out.println( b1.pageCount);

        b1.pageCount = 300;
        System.out.println( b1.pageCount);

        CookBook cb = new CookBook(400, "Best food", "Alex");

        System.out.println( cb.pageCount);

        System.out.println( "====================");

        System.out.println( b1.getPageCount() );

        System.out.println( cb.getPageCount());

        System.out.println( "====================");
        System.out.println( b1.getPageCount());
        System.out.println(cb.getPageCount());

        System.out.println( "====================");

        b1.pageCount = 404;

        System.out.println( b1.pageCount);
        System.out.println(cb.pageCount);

        b1.read();
        cb.read();

        b1.buy();

        cb.buy();
    }

}
