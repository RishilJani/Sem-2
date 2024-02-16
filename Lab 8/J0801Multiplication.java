import java.util.InputMismatchException;
import java.util.Scanner;

public class J0801Multiplication {

    public static void main(String[] args) {
        int x,y;
        Scanner sc= new Scanner(System.in);
        try {
            System.out.println("Enter x :");
            x = sc.nextInt();
            System.out.println("Enter y :");
            y = sc.nextInt();

            if( y < 0){
                sc.close();
                throw new IllegalArgumentException("y should not be negative:");
            }
            System.out.println(power(x, y));
            
        } 
        catch (InputMismatchException e1) {
            System.out.println("Enter valid Input !");
        }
        catch ( Exception e){
            System.out.println("Exception : "+ e );
        }
        sc.close();
    }

    public static int power(int x, int y) {
        int ans = 1;
        for (int i = 0; i < y; i++) {
            ans = ans * x;
        }
        return ans;
    }
}
