class MyThread1 implements Runnable{
    @Override
    public void run() {
        int i = 0;
        while (i<20) {
            System.out.println("Good Morning");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            i++;
        }
    }
}
class MyThread2 implements Runnable{
    @Override
    public void run() {
        int i = 0;
        while (i<10) {
            System.out.println("Afternoon");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            i++;
        }
    }
}
public class J0901 {

    public static void main(String[] args) {
        Runnable t1 = new MyThread1();
        Runnable t2 = new MyThread2();
        Thread t3 = new Thread(t1);
        Thread t4 = new Thread(t2);

        t3.start();
        t4.start();
    }
}
