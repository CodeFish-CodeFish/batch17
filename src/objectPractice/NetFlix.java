package objectPractice;

public class NetFlix {

    static int data = 200;

    String user;

    public  void streaming(){

        System.out.println( user +  " -- streaming -- "+ (data -= 10) );


    }

    public NetFlix(String user) {
        this.user = user;
    }

    public static void main(String[] args) {

        NetFlix n1 = new NetFlix("John");
        NetFlix n2 = new NetFlix("Alex");
       n1.streaming();
       n2.streaming();



       int a = 5;

       String str = "SETST";



    }
}
