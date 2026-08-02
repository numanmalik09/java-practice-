import java.sql.SQLOutput;
import java.util.Scanner;


public class atmsimulation {
     public static void main(String[] args) {
                          //  ATM SIMULATION
    double balance= 5000.0;  // starting balance
    Scanner sc  = new Scanner(System.in); // SCANNER ACTIVATION
int choice ;
         System.out.println("Welcome to ATM SIMULATION Please Select A Option To Continue"); // WELLCOME MESSAGE

do {
    // MENU BAR
    System.out.println("Choose Options According To Your Needs ");
    System.out.println(" 1. Deposit");
    System.out.println(" 2. Withdraw");
    System.out.println(" 3. Check Balance");
    System.out.println(" 4. Exit");
    // USER INPUT
    choice = sc.nextInt();
    // MENU BAR LOGIC OPTION 1  " DEPOSIT "
    if (choice == 1) {
        System.out.println("Enter Deposit Amount");
        double deposit = sc.nextDouble();
        balance = balance + deposit;
        System.out.println("Deposit Successful. New Balance: " + balance);
        // MENU BAR LOGIC OPTION 2  " WITHDRAW"
    } else if (choice == 2) {
        System.out.println("Enter Your Withdarw Amount ");
        double withdraw = sc.nextDouble();

        if (withdraw <= balance)
        {
            balance = balance - withdraw;
            System.out.println("Deposit Successful. New Balance: " + balance);

          } else {
            System.out.println("Insufficent Balance  ");
          } ;
          // MENU BAR LOGIC OPTION 3  " CURRENT BALANCE "
    } else if (choice == 3)
    {
        System.out.println("your current balance is " + balance);
        // MENU BAR LOGIC OPTION 4 " EXIT"
    } else if  ( choice == 4) {
        System.out.println("Thank You  for visiting ");
         //  FOR INVALID INPUT
    }else {
        System.out.println("Invalid Choice , Please  Choose The Correct Options ");
    }
    //  LOOP ENDED HERE
    }while (choice != 4);

}
}

