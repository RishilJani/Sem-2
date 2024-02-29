class BankAccount{
    private int balance = 200;

    public int getBalance(){
        return balance;
    }
    public void withdraw(int amount){
        balance = balance - amount;
    }
}
public class OneTwo implements Runnable{
    private BankAccount account = new BankAccount();

    public static void main(String[] args) {
        OneTwo ac = new OneTwo();
        Thread one = new Thread(ac);
        Thread two = new Thread(ac);
        one.setName("Monica");
        two.setName("Chandlar");
        one.start();
        two.start();
    }

    public void run(){
        for(int i = 0 ;i<10;i++){
            makeWithdraw(10);
            if(account.getBalance() < 0){
                System.out.println("Overdrawn");
            }
        }
    }

    private synchronized void makeWithdraw(int amount){
        if(account.getBalance() >= amount){
            System.out.println(Thread.currentThread().getName() + "  is about to withdraw");

            try{
                System.out.println(Thread.currentThread().getName() + " is going to sleep ");
                Thread.sleep(500);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName() + "  woke up.");
            account.withdraw(amount);
            System.out.println(Thread.currentThread().getName() + " withdrawn.");
        }
        else{
            System.out.println("No more money for " + Thread.currentThread().getName());
        }
    }
}
