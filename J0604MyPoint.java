/*1. Design a class named MyPoint to represent a point with x and y-coordinates. The class contains:
•
i. The data ƒelds x and y that represent the coordinates with getter methods.
ii. A no-arg constructor that creates a point (0, 0).
iii. A constructor that constructs a point with speciƒed coordinates.
iv. A method named distance that returns the distance from this point to a speciƒed point of the MyPoint type.
v. A method named distance that returns the distance from this point to another point with speciƒed x- and y- coordinates. */
import java.lang.Math;
import java.util.Scanner;
class MyPoint {
    float x;
    float y;
    double dis;
    
    MyPoint(){
        x = 0f;
        y = 0f;
    }
    MyPoint(float x,float y){
        this.x = x;
        this.y = y;
    }

    public float getterX(){
        return x;
    }
    public float getterY(){
        return y;
    }


    double distance(MyPoint m2){
        dis = (this.x - m2.x)*(this.x - m2.x) + (this.y - m2.y)*(this.y - m2.y);
        dis = Math.pow(dis,0.5);
        return dis;
    }

    double distance(float x,float y){
        dis = (this.x - x)*(this.x - x) + (this.y - y)*(this.y - y);
        dis = Math.sqrt(dis);
        return dis;
    }
}
public class J0604MyPoint {
    public static void main(String[] args) {
        MyPoint m1 = new MyPoint();
        MyPoint m2 = new MyPoint();

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter corrdinates in m1: ");
        m1.x = sc.nextFloat();
        m1.y = sc.nextFloat();

        System.out.println("Enter corrdinates in m2: ");
        m2.x = sc.nextFloat();
        m2.y = sc.nextFloat();

        System.out.println("Distance by object = "+m1.distance(m2));
        System.out.println("Distance by points = "+ m1.distance(m2.x, m2.y));
        sc.close();
    }
}