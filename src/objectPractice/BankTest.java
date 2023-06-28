package objectPractice;

public class BankTest {

    public static void main(String[] args) {

        BankAccount bank = new BankAccount();

        bank.displayInfo();
        bank.accountHolderName = "ALEX";
        bank.balance = 200;
        bank.bankName = "CHASE";
        bank.password = "apple123";
        bank.userName = "alex123";
        bank.displayInfo();

        bank.deposit(121.07);
        bank.withdraw(5.9);

        bank.logIn("alex123", "apple123");

        bank.logIn("asdsdfre", "apple123");

        System.out.println("---------------");
      
        bank.displayInfo();

        bank.logIn("alex123", "apple123");
        bank.displayInfo();

        System.out.println();
        System.out.println("+++++++++++++");
        BankAccount bank2 = new BankAccount();
        bank2.signUp("Nick", "n12","n12", 1000);

        bank2.displayInfo();

    }

}
