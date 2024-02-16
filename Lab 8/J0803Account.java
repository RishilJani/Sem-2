/* WAP to create Account class, which is representing a bank account where we can deposit and withdraw money. if we want 
to withdraw money which exceed our bank balance? We will not be allowed, create InSufƒcientFundException to handle 
above situation and display proper error message. */

import java.util.Scanner;

class InSufƒcientFundException extends Exception {
    InSufƒcientFundException(String str) {
        super(str);
    }
}

class Account {
    int balance;
    int withdraw;

    void deposit(int dep) {
        balance += dep;

        System.out.println("Money Deposited ! ");
    }

    void withdraw_money(int with) throws InSufƒcientFundException {

        if (balance < with) {
            throw new InSufƒcientFundException("Not suffcient Fund in Account to withdraw !");
        }
        
        balance = balance - with;
        System.out.println("Withdraw Succesfully !");
        System.out.println("Money remaining in balance: " + this.balance);
        System.out.println("Withdrawed money: " + with);
    }

}

public class J0803Account {
    public static void main(String[] args) {
        Account a1 = new Account();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Money to deposit: ");
        a1.deposit(sc.nextInt());

        System.out.println("Enter Money to withdraw: ");
        a1.withdraw = sc.nextInt();

        try {
            a1.withdraw_money(a1.withdraw);

        } catch (InSufƒcientFundException e1) {
            System.out.println(e1.toString());
        }
        sc.close();
    }
}