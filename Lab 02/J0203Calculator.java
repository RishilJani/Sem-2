import java.util.Scanner;

public class J0203Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
                
        System.out.println("Enter operation: ");
        char op = (sc.nextLine()).charAt(0);
        
        System.out.println("Enter 1st num: ");
        float a = sc.nextFloat();
        System.out.println("Enter 2ed num: ");
        float b = sc.nextFloat();



        if(op == '+'){
            System.out.println("Addition = " + (a+b));
        }
        else if(op == '-'){
            System.out.println("Subtration = "+(a-b));
        }
        else if(op == '*'){
            System.out.println("Multiply = "+(a*b));
        }
        else if(op == '/'){
            while (b==0) {
                System.out.println("Enter valid b: ");
                b = sc.nextFloat();
            }
            System.out.println("Division = "+(a/b));
        }
        sc.close();
    }
}
