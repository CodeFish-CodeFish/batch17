package objectPractice;

public class BankAccount {
    /*
        variables:
        -accountHolderName, bankName, balance, userName, password, isLoggedIn
        Methods:
        - void displayInfo() ->will print out all account information
        - double deposit() -> one parameter to update balance
        - double withdraw() -> one parameter to update balance
        - boolean logIn() -> userName, password parameters to update isLoggedIn boolean.
*/

    String accountHolderName, bankName, userName, password;
    boolean isLoggedIn;
    double balance;

    public void displayInfo() {

        if (isLoggedIn == true){

            System.out.println("accountHolderName: " + accountHolderName + "\nbankName " + bankName
                    + "\nUserName: " + userName + "\npassword - " + password + "\nIs Logged In: " + isLoggedIn + "\nBalance: " + balance);

        }else {
            System.out.println("Please log in FIRST");
        }

      }

    public double deposit(double depositAmount) {

        balance += depositAmount;
        System.out.println("Your new balance is : " + balance + " after depositing $" + depositAmount);
        return balance;

    }

    public double withdraw(double withdrawAmount) {

        balance -= withdrawAmount;
        System.out.println("Your new balance is : " + balance + " after withdrawing $" + withdrawAmount);
        return balance;

    }

    public boolean logIn(String userUserName, String userPassword) {

        if (userName.equals(userUserName) && password.equals(userPassword)) {

            isLoggedIn = true;

            System.out.println("Login is Successful!! WELCOME " + isLoggedIn);

        } else {
            isLoggedIn = false;
            System.out.println("Please check password/UserName that you entered " + isLoggedIn);
        }
        return isLoggedIn;
    }

    // create a method 'signUp()' to initialize instance variables

    public void signUp(String accountHolderName1, String userName1, String password1, double balance1){

        accountHolderName =accountHolderName1;
        userName = userName1;
        password = password1;
        balance = balance1;
        System.out.println("Congrats with new Account!");
    }
}