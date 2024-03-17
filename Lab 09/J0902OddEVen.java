/*Write a program to create two threads, one thread will print odd numbers and second thread will print even numbers 
between 1 to 20 numbers */
class Odd extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i < 20) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}

class Even extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i < 20) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}

public class J0902OddEVen {
    public static void main(String[] args) {
        Odd n1 = new Odd();
        Even n2 = new Even();

        n1.start();
        n2.start();
    }
}
