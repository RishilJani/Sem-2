/*
Create a class named Bank_Account with data memebers accountNo, userName, email, accountType and accountBalance, 
Also create methods getAccountDetails() and displayAccountDetails().
 */

import java.util.Scanner;

class Bank_Account{
    long accountNo;
    String userName;
    String email;
    String accountType;
    int accountBalance;
    public void getAccountDetails(Bank_Account b1){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter user Name:");
        b1.userName = sc.nextLine();

        System.out.print("Enter account no:");
        b1.accountNo = sc.nextInt();

        System.out.print("Enter email:");
        b1.email = sc.next();
        
        System.out.print("Enter account Type:");
        b1.accountType = sc.next();

        System.out.print("Enter account Balance:");
        b1.accountBalance = sc.nextInt();

        System.out.println("");
        sc.close();
    }
    public void displayAccountDetails(Bank_Account b1){
        System.out.println("account no: " + b1.accountNo);
        
        System.out.println("user Name: " + b1.userName);
        
        System.out.println("Email: " + b1.email);
        
        System.out.println("account Type: " + b1.accountType);
        
        System.out.println("account Balance: " + b1.accountBalance);

    }
}
public class J0504Bank {
    public static void main(String[] args) {
        Bank_Account b1 = new Bank_Account();
        b1.getAccountDetails(b1);
        b1.displayAccountDetails(b1);
    }    
}
