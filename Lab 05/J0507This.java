/* Write a program in Java to demonstrate use of this keyword. Check whether this can access the Static variables of the class
or not.*/
class  ThisDemo{
    int i;
    static float f;
    ThisDemo(){
        this.i = 2;
        f = 0.5f;
    }
    float f2(){
        return f;
    }
}
public class J0507This {
    public static void main(String[] args) {
        ThisDemo ob = new ThisDemo();
        System.out.println("i = "+ob.i);
        System.out.println("f = "+ob.f2());
    }
}
