class Number{
    static int j = 0;
    public int getJ(){
        return j;
    }
}
public class J0904 implements Runnable{
    // private Number num = new Number();
    public static void main(String[] args) {
        J0904 n1 = new J0904();

        Thread one = new Thread(n1);
        Thread two = new Thread(n1);
        one.setName("one");
        two.setName("two");


        one.start();
        two.start();
    }
    public void run(){
        int i = 0;
        while (Number.j != 2 && i < 2) {
            System.out.println(Number.j);
            digitInc();
            i++;
        }
    }

    synchronized void digitInc(){
        System.out.println(Thread.currentThread().getName() + " is adding 1");
        // num.setJ(1);
        Number.j++;
        // System.out.println(Thread.currentThread().getName() + " is added 1  " + Number.j);
        try{
            // System.out.println(Thread.currentThread().getName() + " is going to sleep ");
            Thread.sleep(500);
        }
        catch(InterruptedException e){
            System.out.println(e);
        }
    }
}