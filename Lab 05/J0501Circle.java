import java.util.Scanner;
class Circle {
    float radius ;
    
    void areaOfCircle(){
        double area = (3.14)*radius*radius;
        System.out.println("area = "+ area);
    }
}
public class J0501Circle{
    public static void main (String[] args){
        Circle c = new Circle();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter radius of circle: ");
        c.radius= sc.nextFloat();
        
        c.areaOfCircle();
        sc.close();
    }
}