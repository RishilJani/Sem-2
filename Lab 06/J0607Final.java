final class Demo{ // This class can't be inheritate
    final int i = 2; // value of i cannot be change
    
    void getter(){
        System.out.println("i= "+i);
    }
}

public class J0607Final {
    public static void main(String[] args) {
        Demo d1 = new Demo();
        d1.getter();
    }
}
