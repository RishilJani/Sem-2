/* Write a program that illustrates interface inheritance. Interface A is extended by A1 and A2. Interface A12 inherits from both 
P1 and P2.Each interface declares one constant and one method. Class B implements A12.Instantiate B and invoke each of 
its methods. Each method displays one of the constants
 */

interface A {
    int a = 9;
    public void displayA();
}
interface A1 extends A{
    int b = 10;
    public void displayA1();
}
interface A2 extends A{
    int c = 1;
    public void displayA2();
}
interface A12 extends A1,A2{
    int d = 15;
    public void displayA2();
}
class B implements A12{
    B(){
        System.out.println("B Constructor");
    }
    public void displayA(){ System.out.println("A = "+ a); }

    public void displayA1(){ System.out.println("A1 = " + b); }
    
    public void displayA2(){ System.out.println("A2 = " +c); }
    
    public void displayA12(){ System.out.println("A12 = " +d); }
}
public class J0702AB {
    public static void main(String[] args) {
        B b1 = new B();

        b1.displayA();
        b1.displayA1();
        b1.displayA2();
        b1.displayA12();
    }
}
